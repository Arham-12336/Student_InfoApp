package com.example.my_dsu.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.my_dsu.databinding.FragmentSearchBinding

class SearchFragment:Fragment() {

    private var _binding : FragmentSearchBinding?=null
    private val binding get()=_binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val SearchBinding =
            ViewModelProvider(this).get(SearchViewModel::class.java)
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSearch
        SearchBinding.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root

    }
}