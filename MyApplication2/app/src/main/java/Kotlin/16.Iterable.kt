package Kotlin

// 반복문

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법
    for (item in a) {
        // println(item)
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }

    for ((index, item) in a.withIndex()) {
        println("index :" + index + " value :" + item)
    }

    println()

    a.forEach {
        println(it)
    }

    a.forEach { item ->
        println(item)
    }

    println()

    a.forEachIndexed { index, item ->
        println("index :" + index + " value :" + item)
    }

    println()
    println(a.size)
    println()

    for (i in 0 until a.size) {
        // until은 마지막 수를 포함하지 않는다
        println(a.get(i))
    }
    println()

    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()

    for (i in a.size - 1 downTo (0)) {
        println(a.get(i))
    }

    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }
    println()

    for (i in 0..10) {
        // ..은 마지막을 포함한다
        println(i)
    }


    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++
        println("b")
    }

    var d: Int = 2
    var e: Int = 3
    do {
        println("Hello")
        d++
    } while (d < e)

}