package com.example.postventalibrary1.ui

import com.example.postventalibrary1.ui.states.ExtraUIStates

interface ChangeUiComponents {
    fun showLoading(show: Boolean)
    fun showAlertMsg(msg: String)
    fun navigateTo(extraUIStates: ExtraUIStates)
}