package com.example.Chap34



fun main(args: Array<String>) {
    run {
        val number = 123
        val text = "あいうえお"
        val car = Car("赤")
        val person = Person("タケシ", 5)
        printClassInfo(number)
        printClassInfo(text)
        printClassInfo(car)
        printClassInfo(person)
    }
}

fun printClassInfo(obj: Any) {
    val hashcode = obj.hashCode()
    val text = obj.toString()
    println("テキスト = ${text}, ハッシュコード= ${hashcode}")
    if (obj is Person) {
        println("↑ これは Personクラスのインスタンスですね！")
    } else if(obj is Car) {
        println("↑ これは Carクラスのインスタンスですね！")
    }
}
class Car(var color: String)
class Person(var name: String, var age: Int)