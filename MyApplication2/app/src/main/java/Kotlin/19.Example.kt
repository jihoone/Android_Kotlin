package Kotlin

import java.util.Scanner

// 문제


fun main(array: Array<String>) {
    // 1번 문제

//    var calculation: Calculation = Calculation(100, 20)
//    calculation.sum()
//    calculation.sub()
//    calculation.mul()
//    calculation.divi()

//    val calculator2 = Calculator2(3)
//    calculator2.plus(5).minus(5)


    // 2번 문제

//    var aMoney: Int = 90000
//
//    var bankAccount: BankAccount = BankAccount()
//    bankAccount.NewAccount("jihoon", "961008")
//    bankAccount.Money("aMoney", aMoney)
//    bankAccount.OutMoney("aMoney", aMoney, 10000)
//    bankAccount.InMoney("aMoney", aMoney, 10000)

//    val account: Account = Account("정지훈", "1996/10/8", 1000)
//    println(account.checkBalance())
//    println(account.save(1000))
//    println(account.withdraw(2000))
//    println(account.checkBalance())

    // 3번 문제

//    var tv: Tv = Tv()
//    tv.OnOff("on")
//
//    val scanner: Scanner = Scanner(System.`in`)
//    println("채널을 입력해주세요")
//    while (true) {
//        val number = scanner.nextInt()
//        if(number == 0){
//            break
//        }
//        tv.Channer(number)
}

class Calculation {
    var first: Int
    var second: Int

    constructor(first: Int, second: Int) {
        this.first = first
        this.second = second
    }

    init {
        println("사칙연산 계산기")
        println()
    }

    fun sum() {
        println("덧셈 결과 : " + (first + second))
    }

    fun sub() {
        println("뺄셈 결과 : " + (first - second))
    }

    fun mul() {
        println("곱셈 결과 : " + (first * second))
    }

    fun divi() {
        println("나눗셈 결과 : " + (first / second))
    }
}

class Calculator1() {
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if (i != 0) {
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0) {
                result = result / value
            }
        }
        return result
    }
}

class Calculator2(val initialValue: Int) {
    fun plus(numbers: Int): Calculator2 {
        val result = this.initialValue + number
        return Calculator2(result)
    }

    fun minus(numbers: Int): Calculator2 {
        val result = this.initialValue - number
        return Calculator2(result)
    }

    fun multiply(numbers: Int): Calculator2 {
        val result = this.initialValue * number
        return Calculator2(result)
    }

    fun divide(numbers: Int): Calculator2 {
        val result = this.initialValue / number
        return Calculator2(result)
    }
}

class BankAccount() {

    init {
        println("은행 계좌 만들기")
        println()
    }

    fun NewAccount(name: String, birt: String) {
        println("이름은 $name 이고 생일은 $birt 인 계좌 생성")
    }

    fun Money(name: String, mony: Int) {
        println("계좌 이름은 $name 이고 잔액은 $mony 입니다.")
    }

    fun OutMoney(name: String, mony: Int, outMoney: Int) {
        println("계좌 이름은 $name 이고 잔액은 $mony 에서 출금 금액 $outMoney 남은금액은 ${mony - outMoney} 입니다.")
    }

    fun InMoney(name: String, mony: Int, inMoney: Int) {
        println("계좌 이름은 $name 이고 잔액은 $mony 에서 애금 금액 $inMoney 남은금액은 ${mony + inMoney} 입니다.")
    }
}

class Account(val name: String, val birth: String, var balance: Int) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account1 {

    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2(val name: String, val birth: String, var balance: Int = 1000) {
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(initialBalance: Int){

//    fun checkBalance():Int{
//        return initialBalance
//    }
}

class Tv {

    init {
        println("TV의 기능")
        println()
    }

    fun OnOff(turn: String) {
        if (turn == "on") {
            println("TV가 켜졌습니다.")
        } else if (turn == "off") {
            println("TV가 꺼졌습니다.")
        } else {
            println("on / off 중에 입력해주세요")
        }
    }

    fun Channer(number: Int) {
        println("입력한 채널은 $number 번 입니다. $number 채널로 이동합니다.")
    }
}

