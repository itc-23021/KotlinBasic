package org.example

fun main(args: Array<String>) {
    val score =  readln().toInt()

    //成績判定
    // 0 ~ 59　は　D
    //60 ~ 69　は　C
    //70 ~ 79　は　B
    //80 ~ 89　は　A
    //90 ~ 100　は　S


   if (score in 1..59) {
       println("D")
   }else if (score in 60..69) {
       println("C")
   }else if (score in 70..79) {
       println("B")
   }else if (score in 80..89) {
       println("A")
   }else if (score in 90..100) {
       println("S")

   }

}


