package com.example.blankkoin.ui.blank

import co.zsmb.rainbowcake.base.RainbowCakeViewModel

class BlankViewModel(
    private val blankPresenter: BlankPresenter
) : RainbowCakeViewModel<BlankViewState>(Loading) {

    fun load() = execute {
        viewState = BlankReady(blankPresenter.getData())
    }

}
