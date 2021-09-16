package com.example.classictube.ui.fragments


import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentCategoryBinding


class CategoryFragment : BaseFragment<FragmentCategoryBinding>() {

    override val LOG_TAG: String = "Categories_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentCategoryBinding = FragmentCategoryBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }


}