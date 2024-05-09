package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    print("1:グー 2:チョキ 3:パー を選んでください: ")
    // 入力は 1,2,3 ですが、0,1,2 となるよう工夫してください↓
    val player = readln().toInt() - 1

    // CPUの手をランダムで決める
    val cpu = Random.nextInt(0, 3)// 0,1,2 のどれかになる
    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "まけ"
        2 -> "かち"
        else -> "?"
    }
}