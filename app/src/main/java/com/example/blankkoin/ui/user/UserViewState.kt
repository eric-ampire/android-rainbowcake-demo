package com.example.blankkoin.ui.user

import com.example.blankkoin.model.entity.User

sealed class UserViewState

object Initial : UserViewState()
object Loading : UserViewState()
class Error(val errorMessage: String?) : UserViewState()
data class UserReady(val data: User) : UserViewState()
