package com.techcafe.wantum

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.techcafe.wantum.auth.SignUpFragment
import com.techcafe.wantum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().also {
            it.replace(binding.fragmentContainer.id, SignUpFragment.newInstance())
            it.commitNow()
        }
    }
}
