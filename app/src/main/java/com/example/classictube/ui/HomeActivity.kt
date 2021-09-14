package com.example.classictube.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classictube.R
import com.example.classictube.ui.adapter.HomeActionListener

class HomeActivity : AppCompatActivity(),HomeActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}