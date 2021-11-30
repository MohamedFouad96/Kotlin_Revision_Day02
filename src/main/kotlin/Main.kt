/** Conditionals */

//fun main(args: Array<String>) {
//
//    /* Comparison operators
//    * ==
//    * !=
//    * >=
//    * <=
//    * >
//    * <
//    * */
//
//    var num1 = 20
//    var num2 = 30
//    var num3 = 40
//
//    if (num1 > num2) {
//        println("True")
//    } else {
//        println("False")
//    }
//
//    if (num1 > num2) {
//        println("True")
//        if (num1 > num3) {
//            println("True")
//        } else {
//            println("False")
//        }
//    } else if (num2 > num3) {
//        println("True")
//    } else {
//        println("False")
//    }
//
//    var condition = if (num1 > num2) {
//        "Number one is greater than number two"
//    } else {
//        "Number two is greater than number one"
//    }
//
//    println(condition)
//
//    /* Logical operators
//    * &&
//    * ||
//    * !
//    * */
//
//    if (num1 > num2 && num1 > num3) {
//        println("True")
//    } else if (num2 > num3) {
//        println("True")
//    } else {
//        println("False")
//    }
//
//
//    var age = 15
//
//    when(age) {
//        in 0..14 -> { println("Child") }
//        in 15..24 -> { println("Youth") }
//        in 25..65 -> { println("Adult") }
//        else -> println("Unknown age")
//    }
//
//    var gender = "Male"
//
//    when(gender) {
//        "Male" -> { println("My Gender is: $gender") }
//        "Female" -> { println("My Gender is: $gender") }
//        else -> { println("Unknown gender") }
//    }
//
//    val whenCondition =  when(age) {
//        in 0..14 -> { "Child" }
//        in 15..24 -> { "Youth" }
//        in 25..65 -> { "Adult" }
//        else -> "Unknown age"
//    }
//
//    println(whenCondition)
//}

/** Functions */

fun output() {
    println("Hello world")
}

fun makeATea(sugar: Double,water: Double, tea: Double) {
    val tea = sugar + water + tea
    println(tea)
}

val tea = { sugar: Double, water: Double , tea: Double ->
    val tea = sugar + water + tea
    println(tea)
}

fun officeBoy(name: String , tea: () -> Unit){
    println(name)
    tea()
}



fun myName(): String {
    val name = "mohamed"
    return name
}


fun sum(num1: Int, num2: Int): Int = num1+num2

var sumAn: (Int,Int) -> Int = { num1, num2 ->
    num1 + num2
}

fun main() {

    output()

    makeATea(1.5,20.0,1.0)
    tea(1.5,20.0,1.0)

   val name =  myName()
    println(name)
    println(myName())

  println(sum(10,20))
    println(sumAn(10,20))


    officeBoy("Toto") {

    }
}

