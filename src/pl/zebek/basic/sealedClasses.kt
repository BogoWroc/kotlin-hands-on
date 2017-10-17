package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-17.
 */
sealed class PersonEvent {
    class Awake: PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val foo: String): PersonEvent()
}

fun handle(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.foo)
    }
}

fun main(args: Array<String>) {
    handle(PersonEvent.Awake())
    handle(PersonEvent.Asleep())
    handle(PersonEvent.Eating("Apple"))
}