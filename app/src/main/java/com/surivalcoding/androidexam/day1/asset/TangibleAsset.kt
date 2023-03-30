package com.surivalcoding.androidexam.day1.asset

abstract class TangibleAsset(
    name: String,
    price: Int,
    val color: String,
    override var weight: Double,
) : Asset(name, price), Thing