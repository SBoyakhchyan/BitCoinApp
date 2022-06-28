package com.example.bitcoinapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_sign_in.*

class SignInFragment : Fragment() {
    private lateinit var  signUpFragment : Fragment
    override fun onCreateView(
        inflater: LayoutInflater,

        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)
        signUpFragment = SignUpFragment()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        signUpHere.setOnClickListener {
            addSignUpToActivity()

        }
    }

    private fun addSignUpToActivity() {
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.container, signUpFragment, "Sign_In")?.addToBackStack("Sign_In")
            ?.commit()
    }
}