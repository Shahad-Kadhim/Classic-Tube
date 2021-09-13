package com.example.classictube

import android.view.LayoutInflater
import com.example.classictube.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(), ParentActionsListener{

        override val LOG_TAG = HomeFragment::class.java.simpleName
        override val bindingInflater: (LayoutInflater) -> FragmentHomeBinding = FragmentHomeBinding::inflate

        lateinit var adapter: ParentAdapter

        override fun setup() {
            val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
            adapter = ParentAdapter(itemsList, this)
            binding.recyclerHome.adapter = adapter
        }

    }
