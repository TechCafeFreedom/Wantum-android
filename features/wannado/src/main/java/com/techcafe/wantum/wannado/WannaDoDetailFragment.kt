package com.techcafe.wantum.wannado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.techcafe.wantum.wannado.databinding.FragmentWannaDoDetailBinding

class WannaDoDetailFragment : Fragment() {

    private lateinit var binding: FragmentWannaDoDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWannaDoDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolBarWannaDoDetail.textToolBarTitle.text = "やりたいことリスト詳細"

        binding.toolBarWannaDoDetail.buttonToolBarBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}