package com.example.classictube.ui.fragments


import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentSaveBinding


class SaveFragment : BaseFragment<FragmentSaveBinding>() {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentSaveBinding = FragmentSaveBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }


}