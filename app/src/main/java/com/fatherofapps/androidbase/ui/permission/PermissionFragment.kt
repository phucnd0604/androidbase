package com.fatherofapps.androidbase.ui.permission

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fatherofapps.androidbase.R
import com.fatherofapps.androidbase.databinding.FragmentPermissionBinding
import com.fatherofapps.androidbase.ui.adapters.CarouselAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PermissionFragment : Fragment() {
    private lateinit var dataBinding: FragmentPermissionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = FragmentPermissionBinding.inflate(inflater)
        dataBinding.lifecycleOwner = viewLifecycleOwner

        return dataBinding.root
    }
}