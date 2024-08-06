package com.example.plannista3.ui.login

data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)