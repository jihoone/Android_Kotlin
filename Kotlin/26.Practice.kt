package Kotlin

import androidx.appcompat.widget.ActivityChooserView

// 과제
// Night, Monster (부모) -> Charactor
// SuperNight, SuperMonster (자식)

fun main(array: Array<String>) {
    val night = SuperNight(130, 8)
    val monster = SuperMonster(100, 10)

    monster.attack(night)
    monster.bite(night)
}

// 상속이 만들어낸 특징
// 자식 클래스는 부모 클래스의 타입이다
// 부모 클래스는 자식 클래스의 타입이 아니다

open class Charator(var hp: Int, val power: Int) {
    fun attack(charator: Charator, power: Int = this.power) {
        charator.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp")
        else println("사망")
    }
}

class SuperNight(hp: Int, power: Int) : Charator(hp, power) {
    override fun defense(damage: Int) {
        val defensePower = 2
        super.defense(damage - defensePower)
    }
}

class SuperMonster(hp: Int, power: Int) : Charator(hp, power) {
    fun bite(charator: Charator) {
        super.attack(charator, power + 2)
    }
}

//open class Night1(var hp: Int, val power: Int) {
//    fun attack(monster: Monster) {
//
//    }
//
//    fun defense(damage: Int) {
//
//    }
//
//    private fun heal() {
//
//    }
//}
//
//open class Monster1(var hp: Int, val power: Int) {
//    fun attack(night: Night) {
//
//    }
//
//    fun defense(damage: Int) {
//
//    }
//}

//// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스 선행되서 인스턴스화 되어야 한다
//class SuperNight(hp: Int, power: Int) : Night1(hp, power) {
//
//}
//
//class SuperMonster(hp: Int, power: Int) : Monster1(hp, power) {
//
//}

