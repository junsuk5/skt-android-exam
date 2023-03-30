package com.surivalcoding.androidexam.day1


// 11시 13분

// val 읽기 전용
// var 읽기, 쓰기
// 안 쓰면 private

fun main() {
    val hero = Hero(
        name = "홍길동",
        hp = 100
    )
    val hero2 = Hero(name = "홍길동")

    val kinoko = Kinoko(
        hp = 10,
        prefix = "A",
        level = 10
    )
    val kinoko2 = Kinoko(10, "A")
    val kinoko3 = Kinoko(prefix = "A")

}