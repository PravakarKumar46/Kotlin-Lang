package com.example.kotlinlang.basicsyntax

fun main() {

    val amount = 0

    /**
     * when statement
     */
    when (amount) {

        in 1..100 -> println("In the range b/w 1 to 100")
        !in 1..10 -> println("outside the range")
        101 -> println("100 triggered")
        150 -> println("150 triggered")
        200 -> println("200 triggered")
        else -> println("entered inside else condition")
    }

    /**
     * loops
     */

    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 1 until 10) {
        print("$i ")
    }
    println()

    val a = listOf(20, 30, 40, 60)
    for (i in a) {
        print("${a.indexOf(i)} ")
    }

    println()

    addNumber(2, 6)



}

/**
 * function
 */

fun addNumber(a: Int, b: Int){
    println("Addition of $a and $b is : ${a+b}")
}
