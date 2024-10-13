package com.example.testcomposetask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import com.example.testcomposetask.databinding.FragmentMedicineDetailsBinding
import com.example.testcomposetask.ui.compose.MedicineDetailScreen

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
