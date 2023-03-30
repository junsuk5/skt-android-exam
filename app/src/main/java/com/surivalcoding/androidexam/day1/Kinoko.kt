package com.surivalcoding.androidexam.day1

open class Kinoko(
    var hp: Int = 50,
    val prefix: String,
    val level: Int = 10, // default parameter
) {
    var attackCount = 10

    open fun attack(hero: Hero) {
        println("버섯이 공격했다")
        hero.hp -= 10
    }
}