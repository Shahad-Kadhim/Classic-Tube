package com.example.classictube.fragments


import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentPlayerBinding


class PlayerFragment : BaseFragment<FragmentPlayerBinding>() {

    override val LOG_TAG: String = "Player_Fragment"

    override val bindingInflater: (LayoutInflater) ->
    FragmentPlayerBinding = FragmentPlayerBinding::inflate

    override fun setUp() {  }

    override fun addCallbacks() {  }


}