package com.example.bitcoinapp

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var welcomePageFragment : Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        welcomePageFragment = WelcomePageFragment()
        addFragmentToActivity()

        supportActionBar?.hide()

    }


    private fun addFragmentToActivity() {
        supportFragmentManager.beginTransaction().add(R.id.container, welcomePageFragment).commit()
    }


}