package com.example.blankkoin.ui.user

import co.zsmb.rainbowcake.withIOContext
import com.example.blankkoin.model.interactor.UserInteractor

class UserPresenter(private val userInteractor: UserInteractor) {

    suspend fun getData() = withIOContext {
        userInteractor.getUserInfo()
    }
}
