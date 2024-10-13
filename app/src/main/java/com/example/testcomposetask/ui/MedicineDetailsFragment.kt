package com.example.testcomposetask.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testcomposetask.databinding.FragmentLoginBinding
import com.example.testcomposetask.databinding.FragmentMedicineDetailsBinding

class MedicineDetailsFragment : Fragment() {
    private val binding: FragmentMedicineDetailsBinding by lazy { FragmentMedicineDetailsBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = binding.root
        binding.composeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MedicineDetailScreen()
            }
        }
        return view
    }
}
