package com.example.kotlinlang.collections

fun main() {

    /**
     * read only collections - immutable -> list
     */
    val listOfItems = listOf("John", "Paul", "Nils", "Head")

//    println(listOfItems)

    listOfItems.forEach {
        println("$it ")
    }

    /**
     * mutableList collection
     */
    val mutableList = mutableListOf(10, 20, 30, 40, 50)

    mutableList.add(800)

    mutableList[3] = 700

    mutableList.removeAt(0)

//    println(mutableList)

    mutableList.forEach {
        print("$it ")
    }

    println()

    println(mutableList.size)

    println("index of element \"700\" is  ${mutableList.indexOf(700)}")

    /**
     * set collection - immutable collection
     */

    val setCol = setOf("AU", "BU", "DU")

    println(setCol)

    /**
     * mutableSet -> mutable collection
     */

    val mutSet = mutableSetOf("AU", "BU", "DU")

    mutSet.add("AP")

    println(mutSet)

    /**
     * map collection -> immutable
     */

    val mapColl = mapOf("apple" to 1, "banana" to 2, "mango" to 3)
    println(mapColl)

    /**
     * mutableMap -> mutable
     */

    val mutableMap = mutableMapOf("a" to 1, "b" to 2 , "c" to 3, "d" to 4)

    mutableMap["e"] = 100

    println(mutableMap)
    println(mutableMap.values)
    println(mutableMap.keys)

}