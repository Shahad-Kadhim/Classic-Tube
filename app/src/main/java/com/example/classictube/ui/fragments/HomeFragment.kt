package com.example.classictube.ui.fragments

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.classictube.R
import com.example.classictube.data.response.MoviesCategory
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.FragmentCategoriesBinding
import com.example.classictube.databinding.FragmentHomeBinding
import com.example.classictube.ui.adapters.HomeActionListener
import com.example.classictube.ui.adapters.NestedAdapter
import com.mig35.carousellayoutmanager.CarouselLayoutManager
import com.mig35.carousellayoutmanager.CarouselZoomPostLayoutListener


class HomeFragment : BaseFragment<FragmentCategoriesBinding>(), HomeActionListener {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentCategoriesBinding = FragmentCategoriesBinding::inflate

    override fun addCallbacks() {}
    override fun setUp() {}


}








