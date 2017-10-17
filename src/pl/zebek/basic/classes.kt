package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-17.
 */
abstract class Person {
    var firstName: String = ""
    var lastName: String = ""

    abstract fun getAddress():String
    open fun getName(): String = "$firstName $lastName" // make function override
    fun finalMethod() = println("Final method")
}

class Student : Person() {
    override fun getAddress(): String {
        return "My address"
    }

    override fun getName() : String {
        return "My name"
    }
}