package com.example.classictube.ui.fragments

import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentHomeBinding
import com.example.classictube.ui.adapters.HomeActionListener


class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionListener {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentHomeBinding = FragmentHomeBinding::inflate

    override fun addCallbacks() {}
    override fun setUp() {}


}








