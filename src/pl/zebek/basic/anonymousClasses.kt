package pl.zebek.basic

/**
 * Created by Bogumil Zebek on 2017-10-18.
 */
interface Process {
    fun execute(value: Int)
}

fun anonymousClassSnippet(){
    val process: Process = object : Process {
        override fun execute(value: Int) {
            println("Some action!!!")
        }

    }
    someMethod(process)
}

fun someMethod(process: Process){
    process.execute(5)
}