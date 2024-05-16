package org.example

fun main(args: Array<String>) {
    run {
        val map: Map<String, String> = mapOf(
            "Pen" to "ペン",
            "Apple" to  "アップル",
            "Pineapple" to "パイナップル"
        )
        val value1 = map["Pen"]
        val value2 = map["Apple"]
        val value3 = map["Pineapple"]
        val value4 = map["Pen"]
        println("$value1 - $value2 - $value3 - $value4")
    }
    run {
        println("---19.2---")
        val map: Map<String, Int> = mapOf(
            "a" to 1,
            "b" to 2,
            "c" to 3,
            "d" to 26
        )
        val value1 = map["a"]
        val value2 = map["b"]
        val value3 = map["c"]
        val value4 = map["z"]
    }
    run {
        println("---19.4---")
        val map = mutableMapOf("Pen"  to "ペン")
        map += "Pineapple" to "パイナップル"
        val value1 = map["Pen"]
        val value2 = map["Pinepple"]
        val value3 = map["apple"]
        map -= "Pen"
        val value4 = map["Pen"]
        println("$value1,  $value2, $value3, $value4")
    }
}