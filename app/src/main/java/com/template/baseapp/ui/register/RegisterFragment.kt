package com.template.baseapp.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.template.baseapp.R
import com.template.baseapp.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment(R.layout.fragment_register) {

    lateinit var binding:FragmentRegisterBinding



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding=FragmentRegisterBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener{

    }

    }
}