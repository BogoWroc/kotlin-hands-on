package pl.zebek.basic

class Data(var first:Int, var second:Int){

}

fun main(args: Array<String>) {
    val d = Data(2,3)

    val message = if(d.first == d.second){
        "Numbers are equals"
    } else{
        "Numbers are different!"
    }

    println(message)
}