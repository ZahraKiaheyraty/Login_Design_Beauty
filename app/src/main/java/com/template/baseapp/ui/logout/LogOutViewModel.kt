package com.template.baseapp.ui.logout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogOutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "خروج از حساب"
    }
    val text: LiveData<String> = _text
}