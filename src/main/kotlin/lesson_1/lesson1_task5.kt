package org.example.lesson_1

fun main() {
    val seconds: Short = 6480

    val minutes: Int = seconds/60
    val remainingSeconds: Int = seconds%60
    val hours: Int = minutes/60
    val remainingMinutes: Int = minutes%60

    println("$hours:$remainingMinutes:0$remainingSeconds")

}