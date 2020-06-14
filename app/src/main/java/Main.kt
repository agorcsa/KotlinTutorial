fun main() {
    /*
    // 1. String interpolation
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

    /* println("How old are you: ")
    // the age will be given by the keyboard and kotlin will read the val
    val age = readLine()!!.toInt()
    println("age is $age")

    // 2. conditionals with "when"
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
    }*/
    // conditionals with if

    // 3. conditionals with "if"
    /*
   val message: String
   message = if (age < 18) {
        "You're too young to vote!"
    } else if (age == 100) {
        "Congratulations"
    } else {
        "You can vote"
    }
    println(message)
*/
    // 4. creates 4 instances of the Player's class
    /* val player1 = Player("Andreea")
    player1.show()

    val player2 = Player("Amber", 5)
    player2.show()

    val player3 = Player("Linux", 4, 8)
    player3.show()

    val player4 = Player("Snow Flake", 2, 5, 1000)
    player4.show()

    println(player3.weapon.name.toUpperCase())
    println(player3.weapon.damageInflicted)
*/
    // 5. more references to the same object
    /* val axe = Weapon("Axe", 12)
    player3.weapon = axe
    println(player3.weapon.name)
    println("Player3 has a weapon an ${axe.name}")

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(player3.weapon.damageInflicted)

    player1.weapon = Weapon("Sword", 10)
    player1.show()

    player2.weapon = player1.weapon
    player2.show()

    player1.weapon = Weapon("Spear", 14)
    player1.show()*/

    // 6. displays the details of each player:
    // name, lives, level, score, weapon name, weapon damageInflicted

    /*player1.show()
    player2.show()
    player3.show()
    player4.show()*/

    /* val redPotion = Loot("Red potion", LootType.POTION,  7.50)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    val ringOfProtection = Loot("Ring of protection", LootType.RING, 40.25)
    // alternative:
    // player1.inventory.add(Loot("Ring of protection", LootType.RING, 40.25))

    player1.inventory.add(redPotion)
    player1.inventory.add(chestArmor)
    player1.inventory.add(ringOfProtection)
    player1.inventory.add(Loot("Invisibility Potion", LootType.POTION, 35.95))

    player1.showInventory()
    println(player1.toString())*/

    //for (i in 1..10) { }
    /* for (i in 0 until 10) {
        println(i)
        println("$i squared is ${i * i}")
    }*/

    /*for (i in 10 downTo 0) {
        println(i)
    }*/

    // creates a loop that prints out all the numbers from 0 to 100,
    // that are divisible by both 3 and 5

    // "%" modular operator, shows the rest of a division
    /*for (i in 0 until 100) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            println(i)
        }
    }
*/
    // alternative to the code above using "step"
    for (value in 3..100 step 3) {
        if (value % 5 == 0) {
            println(value)
        }
    }
}

