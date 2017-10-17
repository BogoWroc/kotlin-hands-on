package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-17.
 */

data class Car(val mark: String, val model: String)

fun main(args: Array<String>) {
    val car1 = Car("Ford","Focus")
    val car2 = Car("Ford","Focus")
    val car3 = car1.copy(model="Mondeo")

    compare(car1, car2)
    compare(car1, car3)
}

private fun compare(car1: Car, car2: Car) {
    if (car1 == car2) {
        println("The same cars!")
    } else {
        println("Cars are different! $car1 is compared to $car2")
    }
}

