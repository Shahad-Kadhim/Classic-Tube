package com.example.classictube.ui.fragments

import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentDetailsBinding


class HomeFragment : BaseFragment<FragmentDetailsBinding>() {

    override val LOG_TAG: String = "Details_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentDetailsBinding = FragmentDetailsBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }

}