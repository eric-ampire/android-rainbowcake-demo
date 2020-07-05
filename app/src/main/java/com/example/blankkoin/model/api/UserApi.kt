package com.example.blankkoin.model.api

import com.example.blankkoin.model.entity.User
import retrofit2.http.GET

interface UserApi {

    @GET("users/1")
    suspend fun getUserInfo(): User
}