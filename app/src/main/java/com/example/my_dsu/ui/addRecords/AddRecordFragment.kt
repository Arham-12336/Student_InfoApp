package com.example.my_dsu.ui.addRecords

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.my_dsu.databinding.FragmentAddRecordBinding
import com.example.my_dsu.ui.favourites.FavouriteViewModel
import com.example.my_dsu.ui.home.HomeViewModel

class AddRecordFragment: Fragment() {

    private var _binding :FragmentAddRecordBinding? =null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val addRecordBinding =
            ViewModelProvider(this).get(FavouriteViewModel::class.java)
        _binding = FragmentAddRecordBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAddRecord
        addRecordBinding.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}
