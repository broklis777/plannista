package com.example.plannista3.ui.availability

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AvailabilityViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is availability Fragment"
    }
    val text: LiveData<String> = _text
}