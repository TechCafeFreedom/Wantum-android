package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.techcafe.wantum.resource.OnClickToolbarItemListener
import com.techcafe.wantum.wannado.databinding.FragmentWannadoDetailBinding

class WannadoDetailFragment : Fragment(), OnClickToolbarItemListener {

    private lateinit var binding: FragmentWannadoDetailBinding
    private val args: WannadoDetailFragmentArgs by navArgs()

    override fun onClickBack() {
        findNavController().popBackStack()
    }

    override fun onClickMore() {
        // TODO Moreボタンタップされたときの処理
    }

    override fun onClickShare() {
        // TODO Shareボタンタップされたときの処理
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWannadoDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbarChelWannadoDetail.title = args.wannado
        binding.toolbarChelWannadoDetail.isShowMore = true
        binding.toolbarChelWannadoDetail.isShowShare = true
        binding.toolbarChelWannadoDetail.listener = this
    }
}
