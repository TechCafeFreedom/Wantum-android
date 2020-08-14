package com.techcafe.wantum.memories

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.techcafe.wantum.repository.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_memories.*
import javax.inject.Inject

@AndroidEntryPoint
class MemoriesFragment : Fragment(R.layout.fragment_memories) {

    @Inject lateinit var userRepository: UserRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            findNavController(this).navigate(R.id.action_to_auth)
        }
        // TODO: mock用 あとで消す
        mock_button.setOnClickListener {
            lifecycleScope.launchWhenResumed {
                val userProfile = userRepository.getUserProfile("test")
                mock_text.text = userProfile.user.userName
            }
        }
    }
}
