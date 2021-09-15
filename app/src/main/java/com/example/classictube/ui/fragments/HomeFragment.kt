package com.example.classictube.ui.fragments

import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentHomeBinding
import com.example.classictube.ui.adapters.HomeActionListener


class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionListener {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentHomeBinding = FragmentHomeBinding::inflate

    override fun addCallbacks() {

//        val adapter = NestedAdapter(ll, this)
//        binding?.recyclerNested?.adapter = adapter

//        //motion header movie
//        val layoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL)
//        view?.findViewById<RecyclerView>(R.id.recycler_movies_header)?.layoutManager = layoutManager
//        view?.findViewById<RecyclerView>(R.id.recycler_movies_header)?.setHasFixedSize(true)
//        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())

    }

    override fun setUp() {
    }

}
