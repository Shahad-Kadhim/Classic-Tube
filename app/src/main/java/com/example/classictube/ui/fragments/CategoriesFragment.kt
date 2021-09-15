package com.example.classictube.ui.fragments


import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentCategoriesBinding


class CategoriesFragment : BaseFragment<FragmentCategoriesBinding>() {

    override val LOG_TAG: String = "Categories_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentCategoriesBinding = FragmentCategoriesBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }


}