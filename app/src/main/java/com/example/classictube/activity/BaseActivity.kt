package com.example.classictube.activity

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.classictube.BaseInterface

abstract class BaseActivity <VB : ViewBinding> : AppCompatActivity() , BaseInterface<VB> {

    abstract override val LOG_TAG: String

    abstract override val bindingInflater: (LayoutInflater) -> VB

    override var _binding: ViewBinding? = null

    override val binding = _binding as VB?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)

        setUp()
        addCallbacks()

    }

    abstract override fun setUp()

    abstract override fun addCallbacks()

    override fun log(value: Any) {
        Log.v(LOG_TAG, value.toString())
    }

}



