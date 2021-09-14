package com.example.classictube.ui.activities


import android.view.LayoutInflater
import com.example.classictube.databinding.ActivityPlayerBinding

class PlayerActivity : BaseActivity<ActivityPlayerBinding>() {

    override val LOG_TAG: String = "Player_Activity"
    override val bindingInflater: (LayoutInflater) -> ActivityPlayerBinding
        = ActivityPlayerBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }
}