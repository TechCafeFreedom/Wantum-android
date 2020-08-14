package com.techcafe.wantum.auth

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
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
        val pref = this.activity?.getSharedPreferences("my_settings", Context.MODE_PRIVATE)
        val stringValue = pref?.getString("stringValue", "")
        GoogleSignInOptions.Builder(signInOption)
            .requestIdToken(stringValue)
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

        binding.buttonSignUpGoogle.setOnClickListener { signInWithGoogle() }

        viewModel.isSignIn.observe(viewLifecycleOwner) {
            // TODO: SignInしていたらfinishしてTop画面へ遷移する
        }

        viewModel.error.observe(viewLifecycleOwner) {
            // TODO: SnackBarでerrorを表示する
        }

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
