package com.example.plannista3.ui.availability

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.plannista3.databinding.FragmentAvailabilityBinding

class AvailabilityFragment : Fragment() {

    private var _binding: FragmentAvailabilityBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val availabilityViewModel =
            ViewModelProvider(this).get(AvailabilityViewModel::class.java)

        _binding = FragmentAvailabilityBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAvailability
        availabilityViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}