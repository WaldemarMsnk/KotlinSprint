package org.example.lesson_2

fun main() {
    val buff: Double = 0.2
    val crystallineOre: Int = 7
    val ironstone: Int = 11

    val buffCrystallineOre: Double = crystallineOre * buff
    val buffIronstone: Double = ironstone * buff

    println("Crystalline ore buff: ${buffCrystallineOre.toInt()}")
    println("Ironstone buff: ${buffIronstone.toInt()}")

}