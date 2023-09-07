package com.example.skydunk.UI.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skydunk.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val lastGameVM: LastGameVM by viewModels()
    var viewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        viewModel.lastGame.bind {
            if (it != null) {
                lastGameVM.bind(it)
            }
        }
    }
}