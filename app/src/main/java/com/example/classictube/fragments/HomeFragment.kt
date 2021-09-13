package com.example.classictube.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.databinding.FragmentDetailsBinding


class HomeFragment : BaseFragment<FragmentDetailsBinding>() {

    override val LOG_TAG: String = "Details_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentDetailsBinding = FragmentDetailsBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }

}