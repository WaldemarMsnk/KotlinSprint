package org.example.lesson_2

fun main() {
    val permanentEmployees: Int = 50
    val interns: Int = 30

    val salaryOfPermanentEmployees: Int = permanentEmployees * 30_000
    val totalSalary: Int = salaryOfPermanentEmployees + interns * 20_000
    val averageSalary: Int = totalSalary / (permanentEmployees + interns)

    println(salaryOfPermanentEmployees)
    println(totalSalary)
    println(averageSalary)
}