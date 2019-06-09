package com.example.blankkoin.ui.blank

import co.zsmb.rainbowcake.base.JobViewModel

class BlankViewModel(
    private val blankPresenter: BlankPresenter
) : JobViewModel<BlankViewState>(Loading) {

    fun load() = execute {
        viewState = BlankReady(blankPresenter.getData())
    }

}
