package com.example.skydunk.UI.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toDrawable
import com.example.skydunk.R
import com.example.skydunk.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var viewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        viewModel.name.bind {
            binding.teamNameTextView.text = it
        }

        binding.teamLogoImageView.setImageResource(R.drawable.bos)
    }
}