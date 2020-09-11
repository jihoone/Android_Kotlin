package Kotlin

// 제어흐름2

// When

fun main(array: Array<String>) {

    val value: Int = 3

    when (value) {
        1 -> {
            println("1")
        }

        2 -> {
            println("2")
        }

        3 -> {
            println("3")
        }

        else -> {
            println("No value")
        }
    }

    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 40
    }
    println(value2)
}