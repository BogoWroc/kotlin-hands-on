package pl.zebek.basic

class Question {
    var answer: String = "Not available!"
    var question: String = "Hmm?"
}

fun main(args: Array<String>) {
    val question = Question()

    println("My question is '${question.question}'")
    println("And the answer is '${question.answer}'")
}