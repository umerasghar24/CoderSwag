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
        Product("DEVSLOPES GRAPHIC BEANIE","$18","hat01"),
        Product("DEVSLOPES HAT BLACK","$20","hat02"),
        Product("DEVSLOPES HAT WHITE","$18","hat03"),
        Product("DEVSLOPES HAT SNAPBACK","$22","hat04")


    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$32","hoodie02"),
        Product("Devslopes Gray Hoodie","$28","hoodie03"),
        Product("Devslopes Hoodie Black","$32","hoodie04"),
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt01"),
        Product("Devslopes Badge Light Gray","$20","shirt02"),
        Product("Devslopes Logo Shirt Red","$22","shirt03"),
        Product("Devslopes Hustle","$22","shirt04"),
        Product("Kickflip Studios","$18","shirt05")
    )
}
