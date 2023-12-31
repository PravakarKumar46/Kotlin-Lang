package com.example.kotlinlang.basicsyntax

import java.util.Arrays
import java.util.Scanner

fun main() {

//    print("Enter a number A : ")
//    val inputA = readln()
//    print("Enter a number B : ")
//    val inputB = readln()
//
//    println("User entered a number is  ${inputA.toInt() + inputB.toInt()}")
//

//    val array = arrayOf(100, 200, 300, 400, 500)
//
//    array[1] = 10000
//    array[2] = 800
//    array[3] = 500
//    array[4] = 400
////    array[5] = 700 //as array size is 5 but adding value in 6th position so indexOutOfBoundsException
//
//    for (i in array) {
//        print("$i ")
//    }
//
//    println()
//    Arrays.sort(array)
//
//    for (i in array) {
//        print("$i ")
//    }
//
//    println()
//
//    for (i in 1 until 4) {
//
//        print("$i ")
//
//    }
//    println()
//
//    val arrayList = ArrayList<String>()
//    arrayList.add("pravakar")
//    arrayList.add("sumit")
//    arrayList.add("ajit")
//    arrayList.add("abhisek")
//
//    for (i in arrayList) {
//
//        print("$i ")
//
//    }
//
//    println()
//
//    val arraListNew = ArrayList<Int>()
//    arraListNew.add(9)
//    arraListNew.add(1)
//    arraListNew.add(4)
//    arraListNew.add(3)
//    for (i in arraListNew) {
//
//        print("$i ")
//
//    }
//    println()
//
//    arraListNew.sort()
//    for (i in arraListNew) {
//
//        print("$i ")
//
//    }
//    println()
    val scanner = Scanner(System.`in`)
//
//    print("Enter a number : ")
////    val a = scanner.nextInt()
//
////    print("Enter a number : ")
////    val b = scanner.nextInt()
//
////    println("Sum of $a and $b is ${sum(a, b)}")
////    println("Multiply of $a and $b is ${mul(a, b)}")
//
//    when (scanner.nextInt()) {
//
//        in 1..10 -> println("Under or equals to 10")
//
//        in 10..20 -> println("In b/w 10 and 20")
//
//        100 -> println("hundred..")
//
//        else -> println("empty or no value present")
//    }

    /**
     * return type
     */

    print("Enter an age : ")
    val boyAge = scanner.nextInt()

    val isBoyMatured = isBoyMatured(age = boyAge)

    if (isBoyMatured) println("Boy is matured!") else println("Boy is not matured!")

    println("Addition of 5 and 4 are : ${addition(5, 4)}")

    println("Multiply by hundred : ${mulByHundred(5)}")

    addByHundred(5)

    /**
     * trailing lambda
     */

    enhanceMessage("Hello lambda function: "){
        addition(10, 20)
    }
}

//fun calculation(a: Int, b: Int): Int = a+b

val sum = { a: Int, b: Int -> a + b }

val mul = { a: Int, b: Int -> a * b }


fun isBoyMatured(age: Int): Boolean{

    return age >= 21
}

val addition: (Int, Int) -> Int = { a, b -> a + b }

val mulByHundred: (Int) -> Int = { it * 100 }

val addByHundred: (Int) -> Unit  = {
    println("Multiply by hundred : ${it + 100}" )
}

/**
 * trailing lambda
 */

fun enhanceMessage(message: String, funAsParameter: () -> Int) {

    println("$message ${funAsParameter()}")

}