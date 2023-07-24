package com.fatherofapps.androidbase.ui.multi_lang

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fatherofapps.androidbase.R
import com.fatherofapps.androidbase.base.fragment.BaseFragment
import com.fatherofapps.androidbase.databinding.FragmentMultiLangBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MultiLangFragment : BaseFragment() {


    private lateinit var dataBinding: FragmentMultiLangBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = FragmentMultiLangBinding.inflate(inflater)
        dataBinding.lifecycleOwner = viewLifecycleOwner

        dataBinding.btnGoIntro.setOnClickListener {
            navigateToPage(R.id.introFragment)
        }


        return dataBinding.root
    }
}