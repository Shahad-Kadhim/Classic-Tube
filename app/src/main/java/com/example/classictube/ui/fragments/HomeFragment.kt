package com.example.classictube.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import com.example.classictube.R
import com.example.classictube.data.Network
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.getListsOfCategories
import com.example.classictube.data.response.Feed
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.FragmentHomeBinding
import com.example.classictube.ui.adapters.HomeActionListener
import com.example.classictube.ui.adapters.NestedAdapter
import com.example.classictube.util.Constant


class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionListener {

    override val LOG_TAG: String = "Home_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentHomeBinding = FragmentHomeBinding::inflate

    override fun addCallbacks() {}

    override fun setUp() {
        Network.makeRequest(this::onSuccess,this::onError)
    }
    private fun onSuccess(feed:Feed){
        this.requireActivity().runOnUiThread {
            binding?.apply {
                recycler.adapter=NestedAdapter(getListsOfCategories(feed.feed!!),this@HomeFragment)
                recycler.show()
                imageError.hide()
                imageLoading.hide()
            }
        }
    }

    private fun onError(message:String){
        requireActivity().runOnUiThread {
            binding?.apply {
                imageLoading.hide()
                imageError.show()
                recycler.hide()
            }
        }
    }

    override fun onClickMovie(movie: MoviesItem) {
        addFragment(
            DetailsFragment().apply {
                arguments= Bundle().apply {
                    putParcelable(Constant.MOVIE_KEY,movie)
//                    putString(Constant.CATEGORYOF_MOVIE,)
                }
            }
        )
    }

    override fun onClickSeeMore(category: CategoryItem) {
       addFragment(
           CategoryFragment().apply {
                arguments= Bundle().apply {  putParcelable(Constant.CATEGORY_KEY,category)}
            }
       )
    }

    override fun onClickGoToPlayList() {
        addFragment(PlayListFragment())
    }

    fun View.hide(){
        this.visibility=View.INVISIBLE
    }

    fun View.show(){
        this.visibility=View.VISIBLE
    }
}

