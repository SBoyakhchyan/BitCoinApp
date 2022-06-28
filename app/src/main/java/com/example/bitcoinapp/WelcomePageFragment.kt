package com.example.bitcoinapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_welcome_page.*

class WelcomePageFragment : Fragment() {
    private lateinit var signUpFragment: Fragment
    private lateinit var signInFragment: Fragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome_page, container, false)
        signInFragment = SignInFragment()
        signUpFragment = SignUpFragment()

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button.setOnClickListener {
            addSignUpToActivity()
        }
        signIn.setOnClickListener {
            addSignInToActivity()
        }
    }

    private fun addSignInToActivity() {
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.container, signInFragment, "Welcome_page")
            ?.addToBackStack("Welcome_page")?.commit()
    }

    private fun addSignUpToActivity() {
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.container, signUpFragment, "Welcome_page")
            ?.addToBackStack("Welcome_page")?.commit()
    }
}