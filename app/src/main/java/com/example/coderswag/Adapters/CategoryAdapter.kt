package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService.categories

class CategoryAdapter(context: Context ,categories:List<Category>) : BaseAdapter() {
    val context = context
    val category = categories //created variables to hold data
    override fun getCount(): Int {
       return category.count()
    }

    override fun getItem(position: Int): Any {
        return category[position]
    }

    override fun getItemId(position: Int): Long {
        return 0 //instead of to do I add 0 because :Long was expecting to return something
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        categoryView =LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage) //id we gave to image View
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName) // id we gave to text view
        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)
        categoryName.text = category.title
        return categoryView
    }
}