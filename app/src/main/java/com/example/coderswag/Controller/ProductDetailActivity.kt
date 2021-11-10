package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_PRODUCTS
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.product_list_item.*

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCTS)
//        val productsImage=findViewById<ImageView>(R.id.productImage)
//        val productName=findViewById<TextView>(R.id.productName)
//        //      val productsImage = itemView.productImage //it could be find view by id
////      val productName =itemView.productName
//        val productPrice=findViewById<TextView>(R.id.productPrice)
        val resourceId = resources.getIdentifier(product?.image, "drawable", packageName)
        detailImageView.setImageResource(resourceId)
        detailProductName.text = product?.title
        detailProductPrice.text = product?.price
    }
}