package com.example.coderswag.Controller

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.ProductsAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORIES
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter : ProductsAdapter //costum adapter wwe created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
       val categoryType= intent.getStringExtra(EXTRA_CATEGORIES)
        Log.e("ProductsActivity","categoryType = $categoryType")
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))
        val layoutManager = GridLayoutManager(this,2) //how many columns you want in layout
        productsListView.layoutManager=layoutManager
        productsListView.adapter=adapter
        var spanCount =3 //column in layout
        var orientation=resources.configuration.orientation
        if (orientation== Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3
        }
        val screenSize =resources.configuration.screenWidthDp
        if (screenSize>720){
            spanCount=3
        }



    }
}