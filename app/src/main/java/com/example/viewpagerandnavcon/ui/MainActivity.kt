package com.example.viewpagerandnavcon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerandnavcon.R
import com.example.viewpagerandnavcon.adapters.ViewPagerAdaptor
import com.example.viewpagerandnavcon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val images = listOf(
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
        )
        val adapter = ViewPagerAdaptor(images)
        binding.viewPager.adapter = adapter

    }
}