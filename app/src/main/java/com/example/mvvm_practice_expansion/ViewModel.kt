package com.example.mvvm_practice_expansion

import android.widget.Toast
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel(val activity: MainActivity): ViewModel() {

    var nameTxt = ObservableField("")
    var edtTxt = ObservableField("")

    init {
        nameTxt.set("초기 상태")
    }

    fun getText(): String? {
        return edtTxt.get()
    }

    fun touchEnterButton() {

        val tempTxt = getText()
        if(tempTxt != "") {
            nameTxt.set(tempTxt)
            edtTxt.set("")
        } else {
            Toast.makeText(activity, "이름을 입력해주세요", Toast.LENGTH_SHORT).show()
        }

    }

    fun touchResetButton() {
        nameTxt.set("초기 상태")
    }
}