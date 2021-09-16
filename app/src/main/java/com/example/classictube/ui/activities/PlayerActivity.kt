package com.example.classictube.ui.activities


import android.view.LayoutInflater
import com.example.classictube.databinding.ActivityPlayerBinding
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer


class PlayerActivity : BaseActivity<ActivityPlayerBinding>() {


    override val LOG_TAG: String = "Player_Activity"
    override val bindingInflater: (LayoutInflater) -> ActivityPlayerBinding
        = ActivityPlayerBinding::inflate

    private lateinit var simpleExoPlayer: SimpleExoPlayer

    val STREAM_URL = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"

    override fun addCallbacks() {   }

    override fun setUp() { initializePlayer() }

    private fun initializePlayer() {
        simpleExoPlayer = SimpleExoPlayer.Builder(this).build()
        binding!!.videoPlayer.player = simpleExoPlayer
        val mediaItem = MediaItem.fromUri(STREAM_URL)
        setPlayer(mediaItem)

    }

    private fun setPlayer(mediaItem: MediaItem) {
        simpleExoPlayer.apply {
            addMediaItem(mediaItem)
            prepare()
            playWhenReady = true
        }

    }

    private fun playPlayer() {
        simpleExoPlayer.play()
    }

    private fun pausePlayer() {
        simpleExoPlayer.pause()
    }

    override fun onResume(){
        super.onResume()
        playPlayer()
    }

    override fun onPause() {
        super.onPause()
        pausePlayer()
    }

    override fun onStop() {
        super.onStop()
        pausePlayer()
    }
}

