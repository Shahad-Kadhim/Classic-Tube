package com.example.classictube.ui.fragments


import android.content.Intent
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.example.classictube.data.response.MoviesCategory
import com.example.classictube.data.response.MoviesItem
import com.example.classictube.databinding.FragmentDetailsBinding
import com.example.classictube.ui.activities.PlayerActivity
import com.example.classictube.util.Constant
import kotlinx.android.synthetic.main.fragment_details.*


class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {

    override val LOG_TAG: String = "Details_Fragment"
    override val bindingInflater: (LayoutInflater) ->
    FragmentDetailsBinding = FragmentDetailsBinding::inflate

    private lateinit var movie :MoviesItem
    override fun addCallbacks() {
        binding?.apply {
            playerButton.setOnClickListener { watchMovie(movie)}
            backButton.setOnClickListener {
                activity?.supportFragmentManager?.popBackStack();
            }
        }
    }

    override fun setUp() {
        arguments?.let {
            movie=it.getParcelable(Constant.MOVIE_KEY)!!
            binding?.apply {
                movieSynopsis.text=movie.description
                movieName.text=movie.title
                movie.ratings?.let{ movieRating.rating = 2.9f }
                movieTime.text=movie.duration.toString()
                year.text = movie.year.toString()
                Glide.with(movieImage).load(movie.art).centerInside().into(movieImage)
                categoryName.text=movie.movieCategoryName
            }
        }
    }

    private fun watchMovie(movie: MoviesItem){
        // add to database
        // insertIntoWatched(movie)
        startActivity(
            Intent(requireActivity(), PlayerActivity::class.java)
                .putExtra(Constant.URL_KEY,movie.url)
        )
    }
}