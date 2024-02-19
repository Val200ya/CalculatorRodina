package com.example.calculatorrodina

import androidx.lifecycle.ViewModel
import android.util.Log

private const val TAG = "CalculatorViewModel"

class CalculatorViewModel : ViewModel() {
    init {
        Log.d(TAG, "ViewModel instance created")
    }
    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel instance about to be destroyed")
    }
}