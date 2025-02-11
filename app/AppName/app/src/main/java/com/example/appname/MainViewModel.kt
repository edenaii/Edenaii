package com.example.appname

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appname.services.CoinGeckoService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val coinGeckoService: CoinGeckoService
) : ViewModel() {

    private val _solanaPrice = MutableLiveData<String>()
    val solanaPrice: LiveData<String> get() = _solanaPrice

    fun fetchSolanaPrice() {
        viewModelScope.launch {
            try {
                val solanaData = coinGeckoService.getSolanaData()
                val price = solanaData.market_data.current_price["usd"]
                _solanaPrice.value = "Solana Price: $$price"
            } catch (e: Exception) {
                _solanaPrice.value = "Error fetching data"
            }
        }
    }
}