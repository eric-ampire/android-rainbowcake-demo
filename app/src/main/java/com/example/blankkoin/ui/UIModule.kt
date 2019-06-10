package com.example.blankkoin.ui

import com.example.blankkoin.ui.blank.BlankPresenter
import com.example.blankkoin.ui.blank.BlankViewModel
import org.koin.dsl.module

val UIModule = module {
    factory { BlankPresenter() }
    factory { BlankViewModel(get()) }
}
