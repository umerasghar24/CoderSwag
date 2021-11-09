package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService { ///singleton onject //create arrays that will hold all of the data
    val categories = listOf(
        Category("SHIRTS","shirtimage") ,Category("HOODIES","hoodieimage"),
        //image names are comming from drawable
        Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","shirtimage") ,Category("HOODIES","hoodieimage"),
            //image names are comming from drawable
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","shirtimage") ,Category("HOODIES","hoodieimage"),
            //image names are comming from drawable
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")

        //class category in models

    )
    val hats = listOf(
        Product("DEVSLOPES GRAPHIC BEANIE","$18","hat1"),
        Product("DEVSLOPES HAT BLACK","$20","hat2"),
        Product("DEVSLOPES HAT WHITE","$18","hat3"),
        Product("DEVSLOPES HAT SNAPBACK","$22","hat4")


    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes Gray Hoodie","$28","hoodie3"),
        Product("Devslopes Hoodie Black","$32","hoodie4"),
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Badge Light Gray","$20","shirt2"),
        Product("Devslopes Logo Shirt Red","$22","shirt3"),
        Product("Devslopes Hustle","$22","shirt4"),
        Product("Kickflip Studios","$18","shirt5")
    )
    val digital = listOf<Product>()
    fun getProducts(category: String):List<Product>{ //using when,if user click on shirts return shirts so on
        return when(category){
            "Shirts"-> shirts
            "Hoodies"-> hoodies
            "Hats"-> hats
            else -> digital
        }

    }
}
