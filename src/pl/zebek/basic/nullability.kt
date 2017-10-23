package pl.zebek.basic


fun main(args: Array<String>) {
    val savable: Savable?= null
    savable?.save()

    savable?.let {
        execute(savable)
    }

    println(someFunction() ?: "Unknown")
}
fun someFunction():String?{
    return null
}

class Meeting{
    lateinit var address: Address

    fun initialization(address:Address){
        this.address = address
    }
}

class Address{

}

fun execute(savable:Savable){
    println("Execute")
    savable.save()
}

interface Savable{
    fun save()
}