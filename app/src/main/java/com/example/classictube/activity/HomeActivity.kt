package com.example.classictube.activity

import android.view.LayoutInflater
import com.example.classictube.BaseInterface
import com.example.classictube.databinding.ActivityHomeBinding


class HomeActivity : BaseActivity<ActivityHomeBinding>()  {

    override val LOG_TAG: String = "Activity_Home"

    override val bindingInflater: (LayoutInflater) -> ActivityHomeBinding = ActivityHomeBinding::inflate

    override fun setUp() { }

    override fun addCallbacks() {  }

}