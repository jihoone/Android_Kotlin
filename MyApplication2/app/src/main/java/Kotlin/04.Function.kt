package Kotlin

// 함수
// 어떤 input을 넣어주면 어떤 output이 나오는 것
// y = x + 2

// 함수 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ....) : 반환형{
// 함수내용
// return 반환
// }값

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기

fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수를 선언하기
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    val result = plus(5, 10)
    val result1 = plus(first = 10, second = 20)

    println(result)
    println(result1)

    println()
    val result2 = plusFive(10, 20)
    println(result2)

    val result3 = plusFive(10)
    println(result3)

    println()
    printPlus(10, 20)
    printPlus(10, 20)

    println()
    val result4 = plusShort(50, 50)
    println(result4)

    println()
    plusMany(1, 2, 3)
}