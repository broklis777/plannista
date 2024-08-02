package com.example.plannista3.data.api

import com.example.plannista3.data.model.LoginRequest
import com.example.plannista3.data.model.LoginResponse
import com.example.plannista3.data.model.RequestData
import com.example.plannista3.data.model.ResponseData
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body
import retrofit2.http.Path
import retrofit2.Call

class ApiService {

    interface ApiService {
        @POST("api/auth/loginByEmail")
        fun authorize(@Body loginRequest: LoginRequest): Call<LoginResponse>

        @GET("endpoint/{id}")
        fun getData(@Path("id") id: String): Call<ResponseData>

        @POST("endpoint")
        fun postData(@Body requestData: RequestData): Call<ResponseData>
    }

}