package org.example

fun main (args:Array<String>){
    val a: IntRange = 1..6
    val b: IntRange = 1..12
    val c: IntRange = 13..15

    println(a)
    println(b)
    println(c)

    val age2: Int = 10
    val range21: IntRange = 0..6
    val range22: IntRange = 7..12
    val range23: IntRange = 13..15

    val flag21 = age2 in range21
    val flag22 = age2 in range22
    val flag23 = age2 in range23

    println("${age2}歳の子供は就学前 ${flag21}")
    println("${age2}歳の子供は小学生 ${flag22}")
    println("${age2}歳の子供は中学生 ${flag23}")

    val flag31 = age2 in range21
    val flag32 = age2 in range22
    val flag33 = age2 in range23

    println("${age2}歳の子供は就学前 ${flag31}")
    println("${age2}歳の子供は小学生 ${flag32}")
    println("${age2}歳の子供は中学生 ${flag23}")

    println("----10.4----")
    val range_a: LongRange = 0..10_000_000_000L
    val range_b: CharRange = 'A'..'E'
    val range_c: CharRange = 'あ'..'お'

    val flag_a = 500 in range_a
    val flag_b = 'D' in range_b
    val flag_c = 'え' in range_c

    println("flag_a=$flag_a")
    println("flag_b=$flag_b")
    println("flag_c=$flag_c")

    println("---10.a---")
    val ranged: IntRange= 0 until 6
    val rangee: IntRange = 0..<6
    println(ranged)
    println(rangee)

}