package com.template.baseapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.template.baseapp.MainActivity
import com.template.baseapp.R
import com.template.baseapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentLoginBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        binding.btnLoginFSubmit.setOnClickListener {
            startActivity(Intent(requireContext(), MainActivity::class.java))
            requireActivity().finish()
        }

        binding.editText.setOnClickListener {
            val action =LoginFragmentDirections.actionLoginFragmentToNewLoginFragment()
            findNavController().navigate(action)
        }

    }
}