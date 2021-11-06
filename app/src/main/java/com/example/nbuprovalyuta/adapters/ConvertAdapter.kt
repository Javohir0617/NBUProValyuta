package com.example.nbuprovalyuta.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nbuprovalyuta.databinding.ItemValyuteBinding
import com.example.nbuprovalyuta.models.MyConverter
import com.example.nbuprovalyuta.models.MyConverterItem

class ConvertAdapter(var context: Context) : ListAdapter<MyConverterItem, ConvertAdapter.VH>(DU()) {

    class DU : DiffUtil.ItemCallback<MyConverterItem>() {
        override fun areItemsTheSame(oldItem: MyConverterItem, newItem: MyConverterItem): Boolean {
            return oldItem.code == newItem.code
        }

        override fun areContentsTheSame(oldItem: MyConverterItem, newItem: MyConverterItem): Boolean {
            return oldItem == newItem
        }


    }

    inner class VH(var binding: ItemValyuteBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(users: MyConverterItem, position: Int) {
            binding.countryName.text = users.code
            Glide.with(context).load(users.image).into(binding.flag)

            if (users.nbu_buy_price == "") {
                binding.sotibOlish.text = "Mavjud emas"
                binding.sotish.text = "Mavjud emas"
            } else {
                binding.sotibOlish.text = users.nbu_buy_price
                binding.sotish.text = users.nbu_cell_price
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemValyuteBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(getItem(position), position)
    }
}