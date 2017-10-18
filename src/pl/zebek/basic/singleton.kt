package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-17.
 */

object Courses{
    var allCourses = arrayListOf<String>()
}


fun main(args: Array<String>) {
    Courses.allCourses.add("Test")
    println(Courses.allCourses)
}