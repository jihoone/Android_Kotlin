package Kotlin

fun main(array: Array<String>) {
    val night = Night(20, 4)
    val monster = Monster(15, 5)

    night.attack(monster)
    monster.attack(night)

//    night.hp =100
//    println(night.hp)
//
//    monster.hp = 200
//    monster.power = 100

}

class Night(private var hp: Int, private var power: Int) {
    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사의 현재 체력은 $hp 입니다.")
        } else println("기사가 죽었습니다")
    }

    private fun heal() {
        // 아무때나 사용 불가
        // 공격 당한후 죽지않았을때
        hp += 3
    }
}

class Monster(private var hp: Int, private var power: Int) {
    fun attack(night: Night) {
        night.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("몬스터의 현재 체력은 $hp 입니다.")
        else println("몬스터가 죽었습니다")
    }
}