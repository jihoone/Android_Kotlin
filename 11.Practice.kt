package Kotlin

// When 실습

fun main(array: Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("null")
        else -> println("Not null")
    }

    val value2: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다
    when (value2) {
        true -> {

        }
        false -> {

        }
        null -> {

        }
    }

    // 값을 리턴하는 when 구문의 경우 반듯이 값을 리턴해야한다
    val value3 = when (value2) {
        true -> 1
        false -> 3
        null -> 4
        // or else -> 4
    }

    // when의 다양한 조건식
    val value4: Int = 10

    when (value4) {
        is Int -> {

        }
        else -> {

        }
    }

    val value5: Int = 87

    when (value5) {
        in 60..70 -> {

        }
        in 70..80 -> {

        }
        else -> {

        }
    }
}