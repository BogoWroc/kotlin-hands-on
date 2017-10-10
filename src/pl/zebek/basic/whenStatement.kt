package pl.zebek.basic

fun resolve(value:String): String{
    when(value){
        "name" -> return "Hello stranger!"
        "some text" -> return "I don't know what to say :("
        else -> return "Hmmm?"
    }
}

fun main(args: Array<String>) {
    println(resolve("unknown"))
    println(resolve("some text"))
    println(resolve("name"))
}