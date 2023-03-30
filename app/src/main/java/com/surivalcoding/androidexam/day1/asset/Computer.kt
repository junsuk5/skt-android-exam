package com.surivalcoding.androidexam.day1.asset

class Computer(
    name: String,
    price: Int,
    color: String,
    val makerName: String,
): TangibleAsset(name, price, color, 0.0)