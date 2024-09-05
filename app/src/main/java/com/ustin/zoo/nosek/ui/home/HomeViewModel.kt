package com.ustin.zoo.nosek.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Posts for every pets' lovers!"
    }
    val text: LiveData<String> = _text
}