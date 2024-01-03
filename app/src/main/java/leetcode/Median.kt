package leetcode

fun main(){

    val a: IntArray = intArrayOf(1, 3)
    val b: IntArray = intArrayOf(2)

    val c = a.plus(b)
    c.sort()

//    for (i in c){
//        print("$i ")
//    }

    val size: Int = c.size
    if (c.size % 2 == 0){
        val res: Double = (c[(size / 2) - 1] + c[(size / 2)]).toDouble()
        println(res/2)
    }else{
        val res = c[size/ 2]
        println(res)
    }

}