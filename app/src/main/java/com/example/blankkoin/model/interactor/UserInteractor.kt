package com.example.blankkoin.model.interactor

import com.example.blankkoin.model.api.UserApi
import com.example.blankkoin.model.entity.User

class UserInteractor(val userApi: UserApi /*, val userDao: UserDao*/) {
    suspend fun getUserInfoBy(): User {
        return userApi.getUserInfo()
    }
}