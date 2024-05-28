package com.example.Chap32

fun main(args: Array<String>) {
    run {
//        println("---31.1---")
//        var text: String = "あいうえお"
//        text = null
//        println("文字列「${text}」の長さ = " + text.length)
    }
    run {
        println("----32.2----")
        var text: String? = "あいうえお"
        text = null
        println("文字列「${text}」の長さ = ${text?.length}")
    }
    run {
        println("----32.12----")
        val list: List<String?> = listOf("あ", "い", "う", null, "お")
        for (text in list) {
            println(text)
        }

    }
    run {
        println("----32.13----")
        val list: List<String?> = listOf("あ", "い", "う", null, "お")
        for  (text in list) {
            text?.let { println(it) }

        }
    }
//    run {
//        println("----32.5----")
//        var text_a: String = "あいうえお"
//        var text_b: String? = "あいうえお"
//        var length_a = countTextLength1(text_a)
//        var length_b = countTextLength1(text_b)
//       // var length_n = countTextLength1(null)
//        text_b = null
//        length_b = countTextLength1(text_b!!)
//    }

    }



fun countTextLength1(text: String?): Int {
    return text?.length ?: 0
}

fun countTextLength2(text: String?): Int {
    if (text != null) {
        return text.length
    }else{
        return 0
    }
}
