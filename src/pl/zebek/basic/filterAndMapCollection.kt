package pl.zebek.basic

fun main(args: Array<String>) {
    val ints = listOf<Int>(1,2,3,4,5,6,7,8)
    val smallInts = ints.filter { it > 4 }

    printContent(smallInts)

    val squeredInts = ints.map { it*it }

    printContent(squeredInts)
}

private fun printContent(values: List<Int>) {
    for (i: Int in values) println(i)
}