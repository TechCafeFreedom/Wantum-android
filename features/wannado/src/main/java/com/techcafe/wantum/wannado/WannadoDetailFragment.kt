package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.techcafe.wantum.resource.OnClickToolbarItemListener
import com.techcafe.wantum.wannado.databinding.FragmentWannadoDetailBinding

class WannadoDetailFragment :
    Fragment(R.layout.fragment_wannado_detail),
    OnClickToolbarItemListener {

    private lateinit var binding: FragmentWannadoDetailBinding
    private val args: WannadoDetailFragmentArgs by navArgs()

    override fun onClickBack() {
        findNavController().popBackStack()
    }

    override fun onClickMore() {
        // TODO Moreボタンタップされたときの処理
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWannadoDetailBinding.bind(view)

        binding.toolbarChelWannadoDetail.title = args.wannado
        binding.toolbarChelWannadoDetail.isShowMore = true
        binding.toolbarChelWannadoDetail.listener = this
    }
}
