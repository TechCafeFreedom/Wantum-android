package com.techcafe.wantum.auth

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.techcafe.wantum.auth.databinding.FragmentSignUpBinding
import com.techcafe.wantum.repository.impl.AuthRepositoryImpl
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class SignUpFragment : Fragment() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    private val factory = SignUpViewModelFactory(AuthRepositoryImpl())
    private val viewModel: SignUpViewModel by viewModels(factoryProducer = { factory })

    private val googleSignInOptions: GoogleSignInOptions by lazy {
        val signInOption = GoogleSignInOptions.DEFAULT_SIGN_IN
        GoogleSignInOptions.Builder(signInOption)
            .requestIdToken(BuildConfig.REQUEST_ID_TOKEN)
            .requestEmail().build()
    }

    private val launcher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        handleSignInWithGoogleResult(resultCode = result.resultCode, data = result.data)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSignUpBinding = FragmentSignUpBinding.inflate(inflater)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.signUpWithGoogle.setOnClickListener { signInWithGoogle() }

        return binding.root
    }

    private fun signInWithGoogle() {
        val client = GoogleSignIn.getClient(requireActivity(), googleSignInOptions)
        val intent = client.signInIntent
        launcher.launch(intent)
    }

    private fun handleSignInWithGoogleResult(resultCode: Int, data: Intent?) {
        if (resultCode != Activity.RESULT_OK) return
        if (data == null) return
        val task = GoogleSignIn.getSignedInAccountFromIntent(data)
        viewModel.handleSignInWithGoogleResult(task)
    }
}