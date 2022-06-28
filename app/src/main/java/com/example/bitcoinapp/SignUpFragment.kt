package com.example.bitcoinapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUpFragment : Fragment() {
    private lateinit var signInFragment : Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val  view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        signInFragment = SignInFragment()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        SignInFromHere.setOnClickListener {
            addSignInToActivity1()
        }
    }

    private fun addSignInToActivity1() {
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.container, signInFragment, "SignUp")?.addToBackStack("SignUp")?.commit()
    }
}