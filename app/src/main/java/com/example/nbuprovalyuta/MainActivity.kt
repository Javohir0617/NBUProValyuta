package com.example.nbuprovalyuta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.nbuprovalyuta.databinding.ActivityMainBinding
import com.example.nbuprovalyuta.fragments.HomeFragment
import com.example.nbuprovalyuta.fragments.SecondFragment
import com.example.nbuprovalyuta.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

   }

}