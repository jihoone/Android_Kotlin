package Kotlin

// 함수 실습

fun plusThree(first: Int, second: Int, third: Int): Int {
    val result = first + second + third
    return result
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun mutiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

// 내부함수
// 함수 안에 함수존재
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>) {
    val result = plusThree(1, 2, 3)
    println(result)

    println()
    val result1 = minusThree(10, 1, 2)
    println(result1)

    println()
    val result2 = mutiplyThree(2, 2, 2)
    println(result2)

    println()
    val result3 = mutiplyThree()
    println(result3)

    println()
    val result4 = showMyPlus(4, 5)
    println(result4)
}