package Kotlin

// 29. 제너릭
// 목적 -> 다양한 타입의 객체들을 다루는 매서드나 컬렉션
// 클래스에서 컴파일시에 타입을 체크해주는 기능
// 제너릭 -> 만들기 어렵 -> 사용하는 법

fun main(args: Array<String>) {

    // 제너릭을 사용x
    // 형변환 필요
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString() // 형변환(타입변환)

    // 제너릭을 사용하는 경우 -> 타입 안전
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String 이라는 것을 보장

    // 강한 타입을 체크할 수 있다.
    val list3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
//    val list4 = listOf<Int>(1, 2, 3, 4, "가") // 강한타입 체크

    val list5 = listOf(1, 2, 3, "가") // -> Any
    // 부모 : Any
    // 자식 : String, Int, Float

}