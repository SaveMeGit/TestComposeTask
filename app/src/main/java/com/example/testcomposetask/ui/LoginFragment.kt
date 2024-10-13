package com.example.testcomposetask.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.testcomposetask.LoginViewModel
import com.example.testcomposetask.R
import com.example.testcomposetask.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private val loginViewModel: LoginViewModel by viewModels()
    private val binding: FragmentLoginBinding by lazy { FragmentLoginBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = binding.root
        binding.composeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                LoginForm(viewModel = loginViewModel, findNavController = findNavController())
            }
        }
        return view
    }
}
