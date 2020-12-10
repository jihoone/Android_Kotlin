package Kotlin

import android.speech.tts.TextToSpeech

// 25. 상속
// 부모로 부터 설명서를 받는다.


fun main(array: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

//    val bus100: Bus100 = Bus100()
//    bus100.drive()
}

// 부모 : Car100
// 자식 : SuperCar, Bus100
open class Car100() {
    open fun drive(): String {
//        println("달린다")
        return "달린다"
    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {
    override fun drive(): String {
        super.drive()
        val run = super.drive()
        return "빨리 $run"
//        println("빨리달린다")
    }

//    override fun stop(){
//
//    }
}

class Bus100() : Car100() {

}


//class Car3(){
//    fun drive(){
//
//    }
//
//    fun stop(){
//
//    }
//}
//
//class SuperCar1(){
////    fun drive(){
////
////    }
////
////    fun stop(){
////
////    }
//}
//
//class Truck1(){
////    fun drive(){
////
////    }
////
////    fun stop(){
////
////    }
//}
//
//class Bus1(){
////    fun drive(){
////
////    }
////
////    fun stop(){
////
////    }
//}