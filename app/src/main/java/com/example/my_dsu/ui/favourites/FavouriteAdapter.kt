package com.example.testing.ui.favourites

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testing.databinding.ItemLikedRecBinding
import com.example.testing.databinding.ItemUnlikeRecBinding
import com.example.testing.model.datamodel.FavouriteRecord

class FavouriteAdapter(private val fav_records: List<FavouriteRecord>) : RecyclerView.Adapter<FavouriteAdapter.LikeViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LikeViewHolder {
        return LikeViewHolder(
            ItemLikedRecBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LikeViewHolder, position: Int) {
        val fav_records = fav_records.get(position)
        holder.binding.tvFavName.text = fav_records.FirstName
        holder.binding.tvFavDesc.text =fav_records.lastName;


    }

    override fun getItemCount(): Int {
        return fav_records.size
    }

    class LikeViewHolder(val binding: ItemLikedRecBinding): RecyclerView.ViewHolder(binding.root)
    class UnlikeViewHolder(val binding: ItemUnlikeRecBinding): RecyclerView.ViewHolder(binding.root)
}