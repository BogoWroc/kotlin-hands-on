package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-17.
 */
open class LittlePerson(val name:String)

class MyStudent(name: String): LittlePerson(name)

class MySecondStudent: LittlePerson {
    constructor(name:String): super(name)
}