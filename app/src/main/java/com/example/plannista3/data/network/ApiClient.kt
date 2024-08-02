package com.example.plannista3.data.network

import com.example.plannista3.data.api.ApiService
import retrofit2.Retrofit

object ApiClient {
    val apiService: ApiService by lazy {
        RetrofitClient.retrofit.create(ApiService::class.java)
    }
}