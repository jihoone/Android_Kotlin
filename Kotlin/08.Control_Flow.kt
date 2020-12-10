package Kotlin

// 제어 흐름

// if, else

fun main(array: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if / else 사용하는 방법
    if (a > b) {

    } else {

    }

    // else if

    // 값을 리턴하는 it 사용방법
    val max = if (a > b) {
        a
    } else {
        b
    }
    println()
    println(max)

    val max1 = if (a > b) a else b
    println(max1)

}