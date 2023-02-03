package com.example.testing.ui.addRecord

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddRecordViewModal : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Add Record Fragment"
    }
    val text: LiveData<String> = _text
}