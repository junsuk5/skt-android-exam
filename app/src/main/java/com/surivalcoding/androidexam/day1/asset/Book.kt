package com.surivalcoding.androidexam.day1.asset

import java.util.Date

class Book(
    name: String,
    price: Int,
    color: String,
    val isbn: String,
) : TangibleAsset(name, price, color, 0.0)