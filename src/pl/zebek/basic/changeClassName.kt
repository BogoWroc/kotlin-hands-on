
@file: JvmName("NewName") //Change default Java Class name ChangeClassNameKt.class

package pl.zebek.basic

@JvmOverloads // in java we can reuse default value
fun someMethod(first:String, second:Int=1){
    println("$first has $second")
}

