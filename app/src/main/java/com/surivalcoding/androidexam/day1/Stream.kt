package com.surivalcoding.androidexam.day1

fun main() {
    val items = listOf(1, 2, 3, 4, 5, 6, 6, 6)

    println(items)

    println(items.toSet())

    println(items.distinct())

    println(items.first())

    println(items.drop(2))

    println(items.take(2))

    // 아무 생각없이 처음부터 끝까지 돌린다
    items.forEach { item ->
        println(item)
    }

    println(
        items.filter { item -> item % 2 == 0 }  // if
            .map { item -> item + 1 }   // 바꾸는거
            .map { item -> "${item * 2}등 " }
    )

    // for 문 대신에
//    repeat(10) {
//        println("Hello")
//    }
//    println(items)
}