package Kotlin

// 배열 실습

fun main(array: Array<String>) {

    var array = arrayOf(1, 2, 3)

    val number = array.get(0)
    println(number)
    // val number1 = array.get(100) -> 순서 중요

    // Array의 Bounds는 처음 만들때 결정된다

    // Array만드는 방법

    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'c')
    val a3 = doubleArrayOf(1.2, 1.3)
    val a4 = booleanArrayOf(true, false, true)

    var a5 = Array(10, { 0 })
//  var a6=Array(5, {1, 2, 3, 4, 5})
    // lambda 부분 설명 필요!!!!
    val a6 = Array(6, { 1;2;3;4;5;6 })

    val number1 = a6[0]
    println()
    println(number1)

}