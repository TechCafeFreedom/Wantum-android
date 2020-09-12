package com.techcafe.wantum.wannado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.techcafe.wantum.wannado.databinding.FragmentWannadoEditDialogBinding

class WannadoEditDialogFragment : BottomSheetDialogFragment() {
    companion object {
        fun newInstance() = WannadoEditDialogFragment()
    }

    private lateinit var binding: FragmentWannadoEditDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWannadoEditDialogBinding.inflate(inflater, container, false)
        return binding.root
    }
}
