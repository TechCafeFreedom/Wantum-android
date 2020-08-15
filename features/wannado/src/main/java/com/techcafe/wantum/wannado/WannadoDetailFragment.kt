package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.techcafe.wantum.wannado.databinding.FragmentWannadoDetailBinding

class WannadoDetailFragment : Fragment() {

    private lateinit var binding: FragmentWannadoDetailBinding
    private val args: WannadoDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWannadoDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolBarChelWannadoDetail.title = args.wannado
        binding.toolBarChelWannadoDetail.isShowMore = true
        binding.toolBarChelWannadoDetail.isShowShare = true
        binding.toolBarChelWannadoDetail.buttonToolBarBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}