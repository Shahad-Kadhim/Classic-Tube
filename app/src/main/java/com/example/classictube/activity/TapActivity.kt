package com.example.classictube.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.classictube.R
import com.example.classictube.databinding.ActivityTapBinding

class TapActivity : BaseActivity<ActivityTapBinding>() {

    override val LOG_TAG: String = "Tap_Activity"
    override val bindingInflater: (LayoutInflater) -> ActivityTapBinding
       = ActivityTapBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }
}