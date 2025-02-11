package com.example.appname

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines withContext

class MainActivity : AppCompatActivity() {

    private lateinit var priceTextView: TextView
    private lateinit var predictButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        priceTextView = findViewById(R.id.priceTextView)
        predictButton = findViewById(R.id.predictButton)

        // Fetch Solana data
        val coinGeckoService = CoinGeckoClient.create()
        CoroutineScope(Dispatchers.IO).launch {
            val solanaData = coinGeckoService.getSolanaData()
            val price = solanaData.market_data.current_price["usd"]
            withContext(Dispatchers.Main) {
                priceTextView.text = "Solana Price: $$price"
            }
        }
    }
}