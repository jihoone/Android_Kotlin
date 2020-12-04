package Kotlin

import java.lang.NullPointerException

// 1, 2 실습

var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// - 존재하지 않는다

// var abc : Int = null -> Int형에 Null을 넣을수 x
var abc1 : Int? = null
var abc2 : Double? = null

var g = a + 3


fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1) // 출력되는게 문자열 null이라 생각하면 x
    println(g)
}