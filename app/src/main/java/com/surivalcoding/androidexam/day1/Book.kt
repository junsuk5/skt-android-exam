package com.surivalcoding.androidexam.day1

import java.util.*

data class Book(
    val title: String,
    val publishDate: Date,
)

fun main() {
    val books = listOf(
        Book("해리포터", Date(100002000)),
        Book("삼국지", Date(100001000)),
        Book("Java", Date(100003000)),
    )

    // 정렬 끝
//    books.sortBy { book -> book.publishDate }
    // 오름차순
    println(books.sortedBy { book -> book.publishDate })
    // 내림차순
    println(books.sortedByDescending { book -> book.publishDate })
}