package com.surivalcoding.androidexam.day1

class Wizard(
    var hp: Int = 100,
    var mp: Int = 0,
    var name: String,
    var wand: Wand? = null,
) {
    fun heal(hero: Hero) {
//        val recoveryPoint: Double = 10 * wand.power
//        hero.hp += recoveryPoint.toInt()
    }
}

fun main() {
    val wizard = Wizard(
        name = "마법사"
    )
    // Java 느낌 + 자만심 쩌는 코드 X
//    if (wizard.wand != null) {
//        println(wizard.wand!!.power)
//    }

    // 안전한 호출
    println(wizard.wand?.power ?: 0.0)

}