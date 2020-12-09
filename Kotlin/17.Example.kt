package Kotlin

// 문제

fun main(array: Array<String>) {

    // 1번 문제

    val firstList = MutableList(9, { 0 })
    val secondList = MutableList(9, { true })

    for (i in 0..8) {
        firstList[i] = i + 1

        if ((i + 1) % 2 == 0) {
            secondList[i] = true
        } else {
            secondList[i] = false
        }
    }

//    firstList.forEachIndexed { index, value ->
//        if (value % 2 == 0) {
//            secondList[index] = true
//        } else {
//            secondList[index] = false
//        }
//    }

    println(firstList)
    println(secondList)

    // 2번 문제

//    val score = 80
//
//    when (score) {
//        in 80..90 -> println("A")
//        in 70..79 -> println("B")
//        in 60..69 -> println("C")
//        else -> println("F")
//    }


    // 3번 문제

//    val number = 89
//
//    val first = number / 10
//    val second = number % 10
//
//    println(first + second)


    // 4번 문제

//    gugudan()
}

fun gugudan() {
    for (i in 1..9) {
        for (j in 1..9) {
            println("$i * $j = " + i * j)
//            println("$i * $j = ${i * j}")
        }
        println()
    }
}
