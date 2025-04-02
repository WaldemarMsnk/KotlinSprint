package org.example.lesson_2

fun main() {
    val departureHours: Int = 9
    val departureMinutes: Int = 39
    val travelMinutes: Int = 457

    val allDepartureMinutes: Int = departureMinutes + departureHours * 60
    val allArrivalMinutes: Int = allDepartureMinutes + travelMinutes
    val arrivalHours: Int = allArrivalMinutes / 60
    val arrivalMinutes: Int = allArrivalMinutes % 60

    println("$arrivalHours:$arrivalMinutes")

}