package com.example.my_dsu.ui.favourites

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.my_dsu.databinding.ItemLikedFavRecBinding
import com.example.my_dsu.model.datamodel.FavouriteRecord

class FavouriteAdapter(private val fav_record:List<FavouriteRecord>):RecyclerView.Adapter<FavouriteAdapter.FavViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavViewHolder {
        return FavViewHolder(ItemLikedFavRecBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: FavViewHolder, position: Int) {
        val fav_record=fav_record.get(position)
        holder.binding.tvFavName.text=fav_record.name
        if(!fav_record.isFav)
            holder.binding.ivIconFav.visibility= View.GONE
    }

    override fun getItemCount(): Int {
        return fav_record.size
    }
    class FavViewHolder(val binding: ItemLikedFavRecBinding):RecyclerView.ViewHolder(binding.root)
}