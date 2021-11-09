package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*
import java.util.zip.Inflater

class CategoryRecycleAdapter(val context: Context, val categories: List<Category> ,val itemClick:(Category)->Unit):RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

//below work done by it self
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view =LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
    return Holder(view,itemClick)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position],context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
    inner class Holder(itemView: View,val itemClick:(Category)->Unit) : RecyclerView.ViewHolder(itemView) {
//        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryImage = itemView.categoryImage
//        val categoryName =itemView.findViewById<TextView>(R.id.categoryName)
        val categoryName = itemView.categoryName
        fun bindCategory(category:Category ,context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable"
            ,context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text =category.title
            //making on Click Listner here
            itemView.setOnClickListener{itemClick(category)}
        }

    }

}