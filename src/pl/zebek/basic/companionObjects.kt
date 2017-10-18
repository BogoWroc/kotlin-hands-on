package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-18.
 */

open class A1{
    companion object:Factory {  // In Kotlin there is no static methods. If you want to add it you must use companion object
        override fun createChild(): B1 {
            return B1()
        }

        fun sayHello()= println("Hello :)")
    }
}

class B1:A1(){

}

interface Factory{
    fun createChild(): B1
}

fun main(args: Array<String>) {
    A1.sayHello()
    A1.createChild()
}