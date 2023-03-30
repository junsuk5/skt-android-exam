package com.surivalcoding.androidexam.day1

class Hero(
    val name: String,
    hp: Int = 100
) {
    var hp: Int = hp
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("hp는 0보다 작을 수 없다")
            }
            field = value
        }


    fun attack(kinoko: Kinoko) {
    }
}

fun main() {
    val hero = Hero(name = "홍길동")
    hero.hp = -5
}
