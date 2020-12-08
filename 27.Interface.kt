package Kotlin

fun main(args: Array<String>) {
    val student_: Student_ = Student_()
    student_.eat()
    student_.sleep()
}

// 27. 인터페이스
// 약속의 구현 -> 구현하면 이 타입
// 생성자 x -> 인스턴스화 시킬수 없다. -> 설명서 x
// 지침서 -> 구현하고 싶으면 반드시 기능을 구현해야한다.

// 상속과 다른점
// 상속은 조상을 찾아가는 느낌
// 인터페이스는 종의 특징

interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPaly : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}

class Student() : Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher() : Person() {

}