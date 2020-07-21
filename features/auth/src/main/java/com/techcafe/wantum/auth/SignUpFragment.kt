package com.techcafe.wantum.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.techcafe.wantum.auth.databinding.FragmentSignUpBinding

class SignUpFragment: Fragment() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSignUpBinding = FragmentSignUpBinding.inflate(inflater)
        return binding.root
    }
}