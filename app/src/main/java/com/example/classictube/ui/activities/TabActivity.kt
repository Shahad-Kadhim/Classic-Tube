package com.example.classictube.ui.activities

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.classictube.R
import com.example.classictube.databinding.ActivityTabBinding
import com.example.classictube.ui.fragments.HomeFragment


class TabActivity : BaseActivity<ActivityTabBinding>() {

    override val LOG_TAG: String = "Tab_Activity"
    override val bindingInflater: (LayoutInflater) -> ActivityTabBinding
       = ActivityTabBinding::inflate


    override fun setUp() {
        replaceFragment(HomeFragment())
    }


    //add fragment inside Tab_Activity
    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment).addToBackStack(null).commit()
    }

}