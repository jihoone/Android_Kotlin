package Kotlin

// 변수

// 변수 선언하는 방법
// var / val 변수명
// 1. variable / 2. Value
// - 내 마음대로 원하는 것을 넣을 수 있는 상자
// - 한번 넣으면 바꿀수 없는 상자



var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)

}