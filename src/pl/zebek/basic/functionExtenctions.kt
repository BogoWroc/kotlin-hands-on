package pl.zebek.basic

fun String.addBang() : String{
    return "$this!"
}

fun main(args: Array<String>) {
    println("Some text".addBang())
}