package com.example.chap37

fun main(args: Array<String>) {
    run {
        println("----37.3----")
        val p = ::calculatePlus
        val m = ::calculateMinus
        printRandomValueCalculation(p)
        printRandomValueCalculation(m)
    }
    run {
        println("----37.4----")
        val p =  fun (x: Double, y: Double) : Double = x + y
        val m = fun (x: Double, y: Double) : Double = x - y
        printRandomValueCalculation(m)
        printRandomValueCalculation(p)
        fun printRandomValueCalculation(calculator: (Double, Double) -> Double) {
            val  x = Math.random()
            val y = Math.random()
            val result = calculator(x,y)
            println("計算結果は${result}です。")
        }
    }
}
fun calculatePlus(x: Double, y: Double) = x + y
fun calculateMinus(x: Double, y: Double) = x - y

fun printRandomValueCalculation(
    calculator: (Double , Double)  -> Double
){
    val x = Math.random()
    val y = Math.random()
    val result = calculator(x,y)
    println("$x と $y の計算結果は${result}です。")
}