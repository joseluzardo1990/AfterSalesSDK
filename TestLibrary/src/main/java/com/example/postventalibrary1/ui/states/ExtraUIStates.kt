package com.example.postventalibrary1.ui.states

sealed class ExtraUIStates{
    data class NavigateToDetails(val id: String) : ExtraUIStates()
}
