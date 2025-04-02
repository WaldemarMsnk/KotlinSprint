package org.example.lesson_2

import kotlin.math.floor

fun main() {
    var depositAmount: Double = 70_000.0
    val annualInterestRate: Double = 16.7
    val depositTermInYears: Int = 20

    repeat(depositTermInYears) {
        depositAmount *= (1 + annualInterestRate / 100)
    }

    println(floor(depositAmount * 1000.0) / 1000.0)
}

