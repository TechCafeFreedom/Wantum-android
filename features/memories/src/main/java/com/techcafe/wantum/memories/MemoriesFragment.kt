package com.techcafe.wantum.memories

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import kotlinx.android.synthetic.main.fragment_memories.*

class MemoriesFragment : Fragment(R.layout.fragment_memories) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button.setOnClickListener {
            findNavController(this).navigate(R.id.action_to_auth)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
