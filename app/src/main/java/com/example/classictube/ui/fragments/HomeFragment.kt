package com.example.classictube.ui.fragments

import android.util.Log
import android.view.LayoutInflater
import com.example.classictube.data.Network
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.moviesCategoryFilter
import com.example.classictube.data.response.Feed
import com.example.classictube.data.response.MoviesCategory
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.FragmentHomeBinding
import com.example.classictube.ui.adapters.CategoryAdapter
import com.example.classictube.ui.adapters.HeaderAdapter
import com.example.classictube.ui.adapters.HomeActionListener
import com.example.classictube.ui.adapters.NestedAdapter
import com.mig35.carousellayoutmanager.CarouselLayoutManager
import com.mig35.carousellayoutmanager.CarouselZoomPostLayoutListener
import com.mig35.carousellayoutmanager.CenterScrollListener





class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionListener {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentHomeBinding = FragmentHomeBinding::inflate

    override fun addCallbacks() {}

    override fun setUp() {

        val layoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL)
        binding?.recyclerHeader?.layoutManager = layoutManager
        binding?.recyclerHeader?.setHasFixedSize(true)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())

        Network.makeRequest(this::onSuccess,this::onError)

    }
    private fun onSuccess(feed:Feed){
        val list=Network.categoriesName()?.map { CategoryItem(it,moviesCategoryFilter(it,feed.feed!!)) }
        this.requireActivity().runOnUiThread {
            binding?.apply {
                recyclerHeader.adapter= feed.feed?.flatMap { it.moviesItems }?.let { HeaderAdapter(it,this@HomeFragment) }
                recyclerCategory.adapter=NestedAdapter(list!! ,this@HomeFragment)
            }
        }
    }

    private fun onError(message:String){
        Log.i(LOG_TAG,message)
    }

}
