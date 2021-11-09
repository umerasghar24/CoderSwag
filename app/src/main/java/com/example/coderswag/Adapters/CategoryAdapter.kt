package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService.categories

class CategoryAdapter(val context: Context, val category: List<Category>) : BaseAdapter() {
    ///created variables to hold data
    override fun getCount(): Int {
       return category.count()
    }

    override fun getItem(position: Int): Any {
        return category[position]
    }

    override fun getItemId(position: Int): Long {
        return 0 //instead of to do I add 0 because :Long was expecting to return something
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View { //getter
        val categoryView:View
        val holder :ViewHolder //for recycle views we use View holders so no need to call id again and again
        if (convertView==null){ //it will run only first time after that it will recycle view in else section no need to call id again and agian while we scroll up or down to different categories
            categoryView =LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder=ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage) //id we gave to image View
            holder.categoryName= categoryView.findViewById(R.id.categoryName) // id we gave to text view
            categoryView.tag= holder
        }else{ //for reuse views
            holder=convertView.tag as ViewHolder
            categoryView=convertView
        }
//        categoryView =LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
//        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage) //id we gave to image View
//        val categoryName : TextView = categoryView.findViewById(R.id.categoryName) // id we gave to text view
        val category = categories[position] //setters
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
                holder.categoryImage?.setImageResource(resourceId)
        println(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }
    private class ViewHolder{
        var categoryImage:ImageView? = null
        var categoryName :TextView? = null
    }
}