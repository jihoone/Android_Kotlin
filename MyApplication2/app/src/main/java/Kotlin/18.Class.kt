package Kotlin

// 클래스

// OOP -> Object Oriented Programing (객체지향 프로그래밍)
// 객체 -> 이름이 있는 모든 것
// 절차지향 프로그래밍 -> 코드를 위에서부터 아래로 실행을 하면 문제 해결
// 객체지향 프로그래밍 -> 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결
// 객체를 만드는 방법
// - 설명서 필요


fun main(array: Array<String>) {

    Car("v8 engine", " big")

    val bigCar = Car("v8 engine", " big")
    val bigCar1: Car = Car("v8 engine", " big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    val runAbleCar: RunAbleCar = RunAbleCar("simple engine", "short body")
    runAbleCar.ride()
    runAbleCar.navi("부산")
    runAbleCar.drive()

    println()

    val runAbleCar2: RunAbleCar2 = RunAbleCar2("nice engine", "long body")
    runAbleCar2.ride()
    runAbleCar2.navi("부산")
    runAbleCar2.drive()

    println()
    val testClass = TestClass()
    testClass.test(10)
    testClass.test(10, 20)

}

class Car(var engine: String, var body: String) {

}

class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }

}

class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunAbleCar(engine: String, body: String) {
    fun ride() {
        println("탑승")
    }

    fun drive() {
        println("달린다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunAbleCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // 객체가 만들어질때 가장 먼저 실행 / 초기셋팅을 할때 유용
    init {
        println("RunAbleCar2 생성 완료")
    }

    fun ride() {
        println("탑승")
    }

    fun drive() {
        println("달린다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}


// 오버로딩 -> 이름이 같지만 받는 파라미터가 다른 함수

class TestClass() {
    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}