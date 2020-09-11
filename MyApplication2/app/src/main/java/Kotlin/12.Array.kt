package Kotlin

// 배열

// 배열 필요이유?
// 그룹이 필요할 때


fun main(array: Array<String>) {

    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    val four: Int = 4
    val five: Int = 5


    // 배열을 생성하는법
    var group = arrayOf<Int>(1, 2, 3, 4, 5)

    println(group is Array)

    var group1 = arrayOf(1, 2, 3, 4, 5)
    var group2 = arrayOf(1, 2, 3.5, "Hello")

    // 배열의 값을 꺼내는 방법
    val test = group.get(3)
    println(test)

    val test1 = group1[0]
    println(test1)

    // 배열의 값을 바꾸는 방법
    group1.set(0, 100)
    println(group1[0])

    group[1] = 20
    println(group[1])
}