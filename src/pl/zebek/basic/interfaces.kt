package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-17.
 */
interface Time {
    fun setTime(hour: Int, mins: Int = 0, secs: Int =0)
    fun setTime(time: KevinTime) = setTime(time.hours) //default method
}

class KevinTime{
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time {
    override fun setTime(hour: Int, mins: Int, secs: Int) {

    }

}

interface A {
    fun doSomething() = {println("Interface A function ")}
}


interface B {
    fun doSomething() = {println("Interface B function ")}
}

class Foo : A, B {
    override fun doSomething(): () -> Unit {
        return super<A>.doSomething()
    }
}