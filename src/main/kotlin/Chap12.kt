package org.example

fun main(args: Array<String>) {
    val x = "Hello"
    when (x) {
        "Good Morning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("どうも！")
    }
    println("---12.2---")
    val x2 = 2
    when (x2) {
        //   1 -> println("ワン")
        //   2 -> println("ツー")
        1, 2 -> {
            println("ワンかツーのどちらかです")
            println("こんにちは")
        }

        3 -> {
            println("スリー")
            println("ありがとう")
        }

        else -> {
            println("ワン、　ツー、　スリー以外の数字です")
            println("さようなら")
        }
    }
}

    val x5 = 2

    val message = when (x5) {
        1 -> "ワン"
        2 -> "ツー"
        3 -> "スリー"
        else -> "ワン、ツー、スリー以外の数字です"

    }

;


