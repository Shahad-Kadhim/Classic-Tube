package com.example.classictube.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.classictube.BaseInterface


abstract class BaseFragment<VB:ViewBinding>: Fragment() , BaseInterface<VB> {

    abstract override val LOG_TAG: String

    abstract override val bindingInflater: (LayoutInflater) -> VB
    override var _binding: ViewBinding? = null

    override var binding: VB? = _binding as VB?
    set(value) = TODO()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUp()
        addCallbacks()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle? ): View? {
        _binding = bindingInflater(layoutInflater)
        return _binding?.root
    }

    abstract override fun setUp()

    abstract override fun addCallbacks()

    override fun log(value: Any){
        Log.v(LOG_TAG,value.toString())
    }

}


