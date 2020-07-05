package com.example.blankkoin.ui


import com.example.blankkoin.model.api.UserApi
import com.example.blankkoin.model.interactor.UserInteractor
import com.example.blankkoin.ui.user.UserPresenter
import com.example.blankkoin.ui.user.UserViewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainModule = module {
    factory { UserPresenter(get()) }
    factory { UserViewModel(get()) }
    factory { UserInteractor(get()) }

    single {
        Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build()
    }

    single {
        get<Retrofit>().create(UserApi::class.java)
    }
}
