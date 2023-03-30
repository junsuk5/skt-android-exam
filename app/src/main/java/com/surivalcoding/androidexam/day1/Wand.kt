package com.surivalcoding.androidexam.day1

data class Wand(
    var name: String,
    var power: Double,
) {
//
//    fun copy(): Wand {
//        return Wand(name, power)
//    }
}

fun main() {
    val wand = Wand("불의 지팡이", 10.0)
    val wand2 = Wand("불의 지팡이", 10.0)

    val (name, power) = wand

//    val wand3 = Wand(
//        name = wand.name,
//        power = wand.power,
//    )
    // deep copy
    val wand3 = wand.copy()
    // 특정 값만 변경해서 복사
    val wand4 = wand.copy(power = 15.0)

    println(wand)
    println(wand2)

    println(wand.hashCode())
    println(wand2.hashCode())

    println(wand == wand2)  // true or false
}