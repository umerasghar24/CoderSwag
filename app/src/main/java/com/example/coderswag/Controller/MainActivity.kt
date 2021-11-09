package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Adapters.CategoryRecycleAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORIES
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter //using own costum adapter built in Adapter //adapter takes data from model and display on UI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //we are giving info where to take data //initializing array adapter
        //we set onclicklistner in CategoryRecycle Adapter using lambda expression
        adapter= CategoryRecycleAdapter(this,DataService.categories,){ category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORIES,category.title)
            startActivity(productIntent)

        }
//            CategoryRecycleAdapter(this, DataService.categories) //data services the object
        //tell the listview we created who it need listen to
        categoryListView.adapter = adapter
        //layout manager for recycler views
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager =layoutManager
        categoryListView.setHasFixedSize(true)

    }
}