package com.techcafe.wantum.memories

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.NavHostFragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_memories.*

@AndroidEntryPoint
class MemoriesFragment : Fragment(R.layout.fragment_memories) {

    private val viewModel: MemoriesViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            findNavController(this).navigate(R.id.action_to_auth)
        }
        // TODO: mock用 あとで消す
        mock_button.setOnClickListener {
            viewModel.fetchUserProfile()
        }

        viewModel.userProfile.observe(viewLifecycleOwner) {
            mock_text.text = it.toString()
        }
    }
}
