package com.example.classictube.ui.fragments


import android.os.Bundle
import android.view.LayoutInflater
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.FragmentCategoryBinding
import com.example.classictube.ui.adapters.CategoryAdapter
import com.example.classictube.ui.adapters.HomeActionListener
import com.example.classictube.util.Constant


class CategoryFragment : BaseFragment<FragmentCategoryBinding>() ,HomeActionListener{

    override val LOG_TAG: String = "Categories_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentCategoryBinding = FragmentCategoryBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {
       arguments?.let {
           val category:CategoryItem=it.getParcelable(Constant.CATEGORY_KEY)!!
           binding?.apply {
               categoryName.text=category.categoryName
               recyclerCategory.adapter=CategoryAdapter(category.movies,this@CategoryFragment)
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

    }

    override fun onClickGoToPlayList() {

    }


}