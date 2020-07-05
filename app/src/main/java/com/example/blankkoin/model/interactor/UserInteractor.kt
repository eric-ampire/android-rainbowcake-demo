package com.example.blankkoin.model.interactor

import com.example.blankkoin.model.api.UserApi
import com.example.blankkoin.model.entity.User

class UserInteractor(private val userApi: UserApi /*, val userDao: UserDao*/) {
    suspend fun getUserInfo(): User {
        return userApi.getUserInfo()
    }
}