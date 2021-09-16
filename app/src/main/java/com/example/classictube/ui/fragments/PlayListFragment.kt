package com.example.classictube.ui.fragments


import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentPlayListBinding


class PlayListFragment : BaseFragment<FragmentPlayListBinding>() {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentPlayListBinding = FragmentPlayListBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }


}