package com.example.classictube.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.databinding.FragmentPlayerBinding


class MainFragment : BaseFragment<FragmentPlayerBinding>() {

    override val LOG_TAG: String = "Main_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentPlayerBinding = FragmentPlayerBinding::inflate

    override fun setUp() {  }

    override fun addCallbacks() {   }


}