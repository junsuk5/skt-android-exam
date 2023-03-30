package com.surivalcoding.androidexam.day1.asset

class Book(
    name: String,
    price: Int,
    color: String,
    val isbn: String,
) : TangibleAsset(name, price, color, 0.0)