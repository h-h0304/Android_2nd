package com.example.mycalculator

fun main() {

    print("num1: ")
    val num1 = readLine()!!.toInt()
    print("num2: ")
    val num2 = readLine()!!.toInt()

    println("원하는 연산을 선택하세요 (+, -, *, /, %): ")
    val operator = readLine()!!

    val calculator = Calculator()

    when (operator) {
        "+" -> {
            val calcAdd = AddOperation()
            println("${num1} 더하기 ${num2} 결과는: ${calcAdd.operate(num1, num2)}입니다.")
        }
        "-" -> {
            val calcSubtract = SubtractOperation()
            println("${num1} 빼기 ${num2} 결과는: ${calcSubtract.operate(num1, num2)}입니다.")
        }
        "*" -> {
            val calcMultiply = MultiplyOperation()
            println("${num1} 곱하기 ${num2} 결과는: ${calcMultiply.operate(num1, num2)}입니다.")
        }
        "/" -> {
            val calcDivide = DivideOperation()
            println("${num1} 나누기 ${num2} 결과는: ${calcDivide.operate(num1, num2)}입니다.")
            println("Result: ${calculator.calculate(num1, num2, DivideOperation())}")
        }
        "%" -> {
            val remainder: (Int, Int) -> Double = { num1, num2 -> (num1 % num2).toDouble() }
            println("Result: ${remainder(num1, num2)}")
        }
        else -> {
            println("올바른 연산자를 선택해주세요.")
        }
    }
}

