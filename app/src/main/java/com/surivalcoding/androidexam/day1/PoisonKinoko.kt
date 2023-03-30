package com.surivalcoding.androidexam.day1

class PoisonKinoko(prefix: String): Kinoko(prefix = prefix) {
    var poisonCount = 5

    override fun attack(hero: Hero) {
        super.attack(hero)

        if (poisonCount > 0) {
            println("독 공격!")
            hero.hp -= 10
            poisonCount--
        }
    }
}