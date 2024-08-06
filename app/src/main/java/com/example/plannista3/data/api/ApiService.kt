// ApiService.kt
package com.example.plannista3.data.api

import com.example.plannista3.data.model.LoginRequest
import com.example.plannista3.data.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/auth/loginByEmail")
    fun authorize(@Body loginRequest: LoginRequest): Call<LoginResponse>
}
