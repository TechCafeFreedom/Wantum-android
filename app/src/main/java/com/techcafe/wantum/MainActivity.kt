package com.techcafe.wantum

import android.content.Context
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.techcafe.wantum.auth.SignUpViewModel
import com.techcafe.wantum.auth.SignUpViewModelFactory
import com.techcafe.wantum.databinding.ActivityMainBinding
import com.techcafe.wantum.repository.MainRepository
import com.techcafe.wantum.repository.impl.AuthRepositoryImpl
import com.techcafe.wantum.repository.impl.MainRepositoryImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

//    private val viewModel: MainViewModel by lazy {
//        ViewModelProvider.NewInstanceFactory().create(MainViewModel::class.java)
//    }

    private val factory = MainViewModelFactory(MainRepositoryImpl())
    private val viewModel: MainViewModel by viewModels(factoryProducer = {factory})

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO AuthFragmentからの遷移
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction().also {
//            it.replace(binding.navHostFragment.id, SignUpFragment.newInstance())
//            it.commitNow()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        setupWithNavController(bottom_navigation_view, navController)
//        }

//        getSharedPreferences("my_settings", Context.MODE_PRIVATE).edit().apply {
//            putString("stringValue", getString(R.string.default_web_client_id))
//            commit()
//
        getWebClientId()
    }

    private fun getWebClientId() {
//        viewModel.getWebClientId(getString(R.string.default_web_client_id), this)
    }
}
