package com.example.appname

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.solanaPrice.observe(this) { price ->
            findViewById<TextView>(R.id.priceTextView).text = "Solana Price: $$price"
        }

        findViewById<Button>(R.id.predictButton).setOnClickListener {
            viewModel.fetchSolanaPrice()
        }
    }
}