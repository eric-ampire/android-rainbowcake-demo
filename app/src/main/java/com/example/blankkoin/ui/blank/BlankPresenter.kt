package com.example.blankkoin.ui.blank

import co.zsmb.rainbowcake.withIOContext

class BlankPresenter {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
