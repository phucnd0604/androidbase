package com.fatherofapps.androidbase.ui.intro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fatherofapps.androidbase.base.fragment.BaseFragment
import com.fatherofapps.androidbase.databinding.FragmentIntroBinding
import com.fatherofapps.androidbase.databinding.FragmentMultiLangBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IntroFragment : BaseFragment() {
    private lateinit var dataBinding: FragmentIntroBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = FragmentIntroBinding.inflate(inflater)
        dataBinding.lifecycleOwner = viewLifecycleOwner


        return dataBinding.root
    }
}