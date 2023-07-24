package com.fatherofapps.androidbase.ui.permission

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fatherofapps.androidbase.R
import com.fatherofapps.androidbase.activities.MainActivity
import com.fatherofapps.androidbase.databinding.FragmentPermissionBinding
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
        dataBinding.btnGo.setOnClickListener {
            (requireActivity() as? MainActivity)?.nav()?.popBackStack(R.id.introFragment, true)
            (requireActivity() as? MainActivity)?.nav()?.navigate(R.id.homeFragment)
        }
        return dataBinding.root
    }
}