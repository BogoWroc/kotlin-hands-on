package pl.zebek.basic

fun main(args: Array<String>) {
    var number:Int? = try{
        Integer.parseInt("2")
    }catch (e:NumberFormatException){
        null
    }

    println("The number is $number")
}