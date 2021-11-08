package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : ArrayAdapter<Category> //adapter takes data from model and display on UI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //we are giving info where to take data //initializing array adapter
        adapter =ArrayAdapter(this,
        android.R.layout.simple_list_item_1,DataService.categories) //data services the object
        //tell the listview we created who it need listen to
        categoryListView.adapter =adapter
    }
}