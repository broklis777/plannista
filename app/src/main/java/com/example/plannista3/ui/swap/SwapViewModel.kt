package com.example.plannista3.ui.swap

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SwapViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is swap Fragment"
    }
    val text: LiveData<String> = _text
}