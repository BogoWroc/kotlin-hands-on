package pl.zebek.basic

class MyData(var element:String?){

}

fun main(args: Array<String>) {
    var data:MyData? = null

    data?.element = "Bla"
    println(data?.element)

    data = MyData(null)
    data.element = "Exist"

    println(data?.element)

}