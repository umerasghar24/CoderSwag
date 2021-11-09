package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter(val context: Context,val product:List<Product>):RecyclerView.Adapter<ProductsAdapter.Holder>() {
  inner  class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
      val productsImage = itemView.productImage //it could be find view by id
      val productName =itemView.productName
      fun bindProducts(product:Product,context: Context){
          val resourceId =context.resources.getIdentifier(product.image,"drawable",
          context.packageName)
          productsImage.setImageResource(resourceId)
          productName.text =product.title
      }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view =LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindProducts(product[position],context)
    }

    override fun getItemCount(): Int {
       return product.count()
    }
}