package com.example.viewpagerandnavcon.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerandnavcon.R
import com.example.viewpagerandnavcon.databinding.ItemViewPagerBinding

class ViewPagerAdaptor(private val images:List<Int>):RecyclerView.Adapter<ViewPagerAdaptor.ViewPagerViewHolder>() {
    private lateinit var binding: ItemViewPagerBinding
    inner class ViewPagerViewHolder(binding: ItemViewPagerBinding ):RecyclerView.ViewHolder(binding.root){
        val img: ImageView =binding.imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        binding= ItemViewPagerBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
    val curImage = images[position]
        holder.img.setImageResource(curImage)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}