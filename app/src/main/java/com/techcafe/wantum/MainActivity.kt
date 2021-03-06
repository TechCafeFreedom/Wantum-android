package com.techcafe.wantum

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.techcafe.wantum.databinding.ActivityMainBinding
import com.techcafe.wantum.repository.impl.MainRepositoryImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val factory = MainViewModelFactory(MainRepositoryImpl())
    private val viewModel: MainViewModel by viewModels(factoryProducer = { factory })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO AuthFragmentからの遷移
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        setupWithNavController(binding.bottomNavigationView, navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.bottomNavigationView.isVisible = when (destination.id) {
                R.id.wannado_detail -> false
                else -> true
            }
        }

        viewModel.getWebClientId(getString(R.string.default_web_client_id), this)
    }
}
