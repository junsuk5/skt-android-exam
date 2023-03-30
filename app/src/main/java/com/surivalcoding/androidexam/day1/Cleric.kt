package com.surivalcoding.androidexam.day1

import java.lang.Integer.min
import kotlin.random.Random

class Cleric (
    val name: String,
    var hp: Int = Cleric.maxHp,
    var mp: Int = Cleric.maxMp,
) {
    init {
        println("init 블럭")
    }

    fun selfAid() {
        if (mp < 5) {
            return
        }

        mp -= 5
        hp = maxHp
    }

    fun pray(sec: Int): Int {
        // 회복량
        val recovery = sec + Random.nextInt(0, 3)
        val beforeMp = mp
        mp = min(mp + recovery, maxMp)
        return mp - beforeMp
    }

    // static
    companion object {
        const val maxHp = 50
        const val maxMp = 10
    }
}

fun main() {
    val cleric = Cleric(
        name = "성직자",
        hp = 100,
        mp = 50,
    )

    val cleric1 = Cleric(
        name = "성직자",
        hp = 100,
    )

    val cleric2 = Cleric(
        name = "성직자",
        mp = 50,
    )

//    val cleric3 = Cleric()  // error
}