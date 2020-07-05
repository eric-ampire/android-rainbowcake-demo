package com.example.blankkoin.ui.user

import android.os.Bundle
import android.view.View
import android.widget.Toast
import co.zsmb.rainbowcake.base.RainbowCakeFragment
import co.zsmb.rainbowcake.koin.getViewModelFromFactory
import coil.api.load
import coil.transform.CircleCropTransformation
import com.example.blankkoin.R
import kotlinx.android.synthetic.main.fragment_user.*

class UserFragment : RainbowCakeFragment<UserViewState, UserViewModel>() {

    override fun provideViewModel() = getViewModelFromFactory()
    override fun getViewResource() = R.layout.fragment_user

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        viewModel.load()
    }

    override fun render(viewState: UserViewState) {
        when (viewState) {
            is Loading -> {
                viewFlipper.displayedChild = 0
            }
            is UserReady -> {
                viewFlipper.displayedChild = 1

                tvUserLogin.text = viewState.data.name
                ivUserProfile.load(viewState.data.avatar_url) {
                    crossfade(true)
                    placeholder(android.R.color.darker_gray)
                    transformations(CircleCropTransformation())
                }
            }
            is Error -> {
                Toast.makeText(requireContext(), viewState.errorMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
