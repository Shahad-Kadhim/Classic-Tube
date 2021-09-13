package com.example.classictube.ui.activities

import android.view.LayoutInflater
import com.example.classictube.databinding.ActivityTabBinding


class TabActivity : BaseActivity<ActivityTabBinding>() {

    override val LOG_TAG: String = "Tab_Activity"
    override val bindingInflater: (LayoutInflater) -> ActivityTabBinding
       = ActivityTabBinding::inflate

    override fun addCallbacks() {   }

    override fun setUp() {   }
}