package com.example.mycalculator

class Calculator{
    fun calculate(num1: Int, num2: Int, operation: AbstractOperation): Double{
        return operation.operate(num1, num2)
    }
}
