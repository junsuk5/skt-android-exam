package com.surivalcoding.androidexam.day1

fun main() {
    // 0
    val items = listOf(1, 2, 3, 4, 5)

    println(items.first().isEven())
    println(items.first().isOdd())

    println(items.sum())

    println(items.any { it > 10 })

    // 1, 2, 3, 4, 5
    // 3, 3, 4, 5
    // 6, 4, 5
    // 10, 5
    // 15
    println(items.fold(0) { sum, num -> sum + num })
    println(items.reduce { sum, num -> sum + num })
    println(items.fold(1) { sum, num -> sum * num })
    println(items.reduce { sum, num -> sum * num })

    println(items)

    println(items.toSet())

    println(items.distinct())

    println(items.first())

    println(items.drop(2))

    println(items.take(2))

    // 아무 생각없이 처음부터 끝까지 돌린다
    items.forEach { println(it) }

    println(
        items.filter { it % 2 == 0 }  // if
            .map { it + 1 }   // 바꾸는거
            .map { "${it * 2}등 " }
    )

    // for 문 대신에
//    repeat(10) {
//        println("Hello")
//    }
//    println(items)
}

// 확장함수 extension function
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Int.isOdd(): Boolean {
    return !isEven()
}