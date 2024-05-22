package com.example.Chap28

import com.example.chap27.Car5
import com.example.chap27.Ferrari

fun main(args: Array<String>) {

        val car = Ferrari()
        car.drive(100.0)

}
//28.2
class Farrari(color: String) : Car5(color) {
    //28.3
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のフェラーリが走っています")
        println("おおっ、かっこいい!")
        println("マイレージは ${distance}キロになったぜい")
        super.drive(d)
    }
}

class Prius(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っています！スィーん！")
        println("静かですね")
        println("マイレージは ${distance}キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません")
    }
}

