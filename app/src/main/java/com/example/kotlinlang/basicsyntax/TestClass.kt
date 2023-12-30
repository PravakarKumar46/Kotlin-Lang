package com.example.kotlinlang.basicsyntax

import java.util.Scanner

fun main() {

//    print("Enter a number A : ")
//    val inputA = readln()
//    print("Enter a number B : ")
//    val inputB = readln()
//
//    println("User entered a number is  ${inputA.toInt() + inputB.toInt()}")
//

    val scanner = Scanner(System.`in`)

    print("Enter a number : ")
//    val a = scanner.nextInt()

//    print("Enter a number : ")
//    val b = scanner.nextInt()

//    println("Sum of $a and $b is ${sum(a, b)}")
//    println("Multiply of $a and $b is ${mul(a, b)}")

    when(scanner.nextInt()){

        in 1..10 -> println("Under 10")

        in 10..20 -> println("In b/w 10 and 20")

        100 -> println("hundred..")

        else -> println("empty or no user matching value")
    }

}

//fun calculation(a: Int, b: Int): Int = a+b

val sum  = {a:  Int, b: Int -> a  + b}

val mul  = {a:  Int, b: Int -> a  * b}


