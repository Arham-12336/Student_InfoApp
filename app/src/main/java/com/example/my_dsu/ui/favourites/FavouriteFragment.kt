package com.example.testing.ui.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testing.databinding.FragmentFavouritesBinding

class FavouriteFragment: Fragment() {
    private var _binding: FragmentFavouritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val favouriteViewModel =
            ViewModelProvider(this).get(FavouriteViewModal::class.java)

        _binding = FragmentFavouritesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.rvFavRecords.layoutManager = LinearLayoutManager(context)
        favouriteViewModel.getAllFavRecords().observe(viewLifecycleOwner){
            binding.rvFavRecords.adapter = FavouriteAdapter(it)
        }
        return root
    }
}