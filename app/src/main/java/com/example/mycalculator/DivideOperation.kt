package com.example.mycalculator


class DivideOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double =(num1.toDouble()/num2).toDouble()
}