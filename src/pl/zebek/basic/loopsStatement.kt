package pl.zebek.basic

import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {

    for(i in 1..10){
        println(i)
    }

    for(i in 1..10 step 2){
        println(i)
    }

    for(i in 10 downTo 1 step 3){
        println(i)
    }

    for(i in 1 until 10){
        println(i)
    }

    val numbers = listOf(1,2,4)
    for (number in numbers){
        println(number)
    }

    val map = HashMap<String,Int>()
    map["Bogumil"] =37
    map["Ola"] =33

    for((name, age) in map){
        println("$name is $age")
    }


    for ((index, element) in numbers.withIndex()){
        println("Element $element is at $index")
    }
}
