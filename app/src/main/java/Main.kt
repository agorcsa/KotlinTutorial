fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var name: String
    name = "Andreea"
    println("My name is $name")

    var weeklySalary: Int = 1000
    var monthlySalary: Int = weeklySalary * 4;

    println("The weekly salary is $weeklySalary")
    println("The monthly salary is ${weeklySalary * 4}, which is $weeklySalary * 4")

    val oranges: Int = 5
    val apples: Int = 6
    var fruit: Int = oranges + apples

    println("$oranges oranges + $apples apples = $fruit pieces of fruit")
    println("A qaurter of all the fruits is equal to ${fruit/4}")
    println("A quarter of the apples is ${apples / 4}")

    val weeks: Int = 234
    val years: Double = weeks / 52.0
    println("$weeks weeks in years is $years")

    println("My name is $name")
}
