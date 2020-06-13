fun main() {
    /*
    // String interpolation
    println("Hello World")
    println("My first Kotlin program")

    val name = "Andreea"
    println("My name is $name")

    val weeklySalary = 1000
    val monthlySalary: Int = weeklySalary * 4

    println("The weekly salary is $weeklySalary")
    println("The monthly salary is ${weeklySalary * 4}, which is $weeklySalary * 4")

    val oranges = 5
    val apples = 6
    val fruit: Int = oranges + apples

    println("$oranges oranges + $apples apples = $fruit pieces of fruit")
    println("A qaurter of all the fruits is equal to ${fruit/4}")
    println("A quarter of the apples is ${apples / 4}")

    val weeks = 234
    val years: Double = weeks / 52.0
    println("$weeks weeks in years is $years")

    val jim = "James T.Kirk"

    println("My name is $name")
    println("The captain of the enterprise is $jim")
    println("I can print \$name")
    println("My monthly salary is $monthlySalary$")*/

    // conditionals
   /* val lives = 0;
    // can be true or false, depending of the value of "lives"
    var isGameOver = (lives < 1)
    println(isGameOver)

    if (isGameOver) {
        println("Game over")
    } else {
        println("You're still alive!")
    }*/

    println("How old are you: ")
    // the age will be given by the keyboard and kotlin will read the val
    val age = readLine()!!.toInt()
    println("age is $age")

    // conditionals with when
    val message: String
    message = when {
        age < 18 -> {
            "You're too young to vote!"
        }
        age == 100 -> {
            "Congratulations"
        }
        else -> {
            "You can vote"
        }
    }
      // conditionals with if
//    message = if (age < 18) {
//        "You're too young to vote!"
//    } else if (age == 100) {
//        "Congratulations"
//    } else {
//        "You can vote"
//    }

    println(message)
}
