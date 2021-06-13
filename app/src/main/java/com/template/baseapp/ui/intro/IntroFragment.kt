package com.template.baseapp.ui.intro

import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.template.baseapp.R
import com.template.baseapp.databinding.FragmentIntroBinding
import com.template.baseapp.util.startAnimation
import kotlinx.coroutines.delay

class IntroFragment : Fragment(R.layout.fragment_intro) {
    lateinit var binding: FragmentIntroBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentIntroBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val animation =
            AnimationUtils.loadAnimation(requireContext(), R.anim.explosion_anim).apply {
                duration = 1500
                interpolator = AccelerateDecelerateInterpolator()
            }


        binding.viewSplashFExplosion.isVisible = true
        binding.viewSplashFExplosion.startAnimation(animation) {
            binding.farme.setBackgroundColor(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.purple_500
                )
            )
            binding.viewSplashFExplosion.isVisible = false
        }

        lifecycleScope.launchWhenStarted {
            navigation()
        }
    }

    private suspend fun navigation() {
        delay(1500)
        findNavController().navigate(R.id.action_introFragment_to_loginFragment)
    }
}