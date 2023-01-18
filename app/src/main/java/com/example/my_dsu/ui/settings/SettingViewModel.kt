package com.example.my_dsu.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingViewModel:ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Setting Fragment"
    }
    val text: LiveData<String> = _text
}