fun main() {
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
    println("My monthly salary is $monthlySalary$")
}
