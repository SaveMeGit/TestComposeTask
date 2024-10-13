package com.example.testcomposetask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.testcomposetask.MedicineViewModel
import com.example.testcomposetask.databinding.FragmentGreetingsBinding
import com.example.testcomposetask.ui.compose.GreetingScreen

class GreetingsFragment : Fragment() {
    private val binding: FragmentGreetingsBinding by lazy { FragmentGreetingsBinding.inflate(layoutInflater) }
    private val medicineViewModel: MedicineViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = binding.root
        binding.composeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                GreetingScreen(viewModel = medicineViewModel, findNavController = findNavController())
            }
        }
        return view
    }
}