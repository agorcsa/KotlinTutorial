import `object`.Loot
import `object`.LootType
import `object`.Player
import `object`.Weapon
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    // 1. String interpolation
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
    println("A quarter of all the fruits is equal to ${fruit / 4}")
    println("A quarter of the apples is ${apples / 4}")

    val weeks = 234
    val years: Double = weeks / 52.0
    println("$weeks weeks in years is $years")

    val jim = "James T.Kirk"

    println("My name is $name")
    println("The captain of the enterprise is $jim")
    println("I can print \$name")
    println("My monthly salary is $monthlySalary$")

    // 2. conditionals
    val lives = 0
    // can be true or false, depending of the value of "lives"
    val isGameOver = (lives < 1)
    println(isGameOver)

    println("Game over")

    println("How old are you: ")
    // the age will be given by the keyboard and kotlin will read the val
    val age = readLine()!!.toInt()
    println("age is $age")

    // 2.1 conditionals with "when"
    val message: String
    when {
        age < 18 -> {
            val s = "You're too young to vote!"
        }
        age == 100 -> {
            val s = "Congratulations"
        }
        else -> {
            val s = "You can vote"
        }
    }

    // 2.2 conditionals with if

    // 2.3. conditionals with "if"
    message = if (age < 18) {
        "You're too young to vote!"
    } else if (age == 100) {
        "Congratulations"
    } else {
        "You can vote"
    }
    println(message)


    // 3. for loops
    // for (i in 1..10) { }
    for (i in 0 until 10) {
        println(i)
        println("$i squared is ${i * i}")
    }

    for (i in 10 downTo 0) {
        println(i)
    }

    // creates a loop that prints out all the numbers from 0 to 100,
    // that are divisible by both 3 and 5

    // "%" modular operator, shows the rest of a division
    for (i in 0 until 100) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            println(i)
        }
    }

    // alternative to the code above using "step"
    for (value in 3..100 step 3) {
        if (value % 5 == 0) {
            println(value)
        }
    }

    // 4. creates player instances
    val player1 = Player("Andreea")
    player1.show()

    val player2 = Player("Amber", 5)
    player2.show()

    val player3 = Player("Linux", 4, 8)
    player3.show()

    val player4 = Player("Snow Flake", 2, 5, 1000)
    player4.show()

    println(player3.weapon.name.toUpperCase(Locale.ROOT))
    println(player3.weapon.damageInflicted)

// 5. more references to the same object
    val axe = Weapon("Axe", 12)
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
    player1.show()

// 6. displays the details of each player:
// name, lives, level, score, weapon name, weapon damageInflicted

    player1.show()
    player2.show()
    player3.show()
    player4.show()

    val redPotion = Loot("Red potion", LootType.POTION, 7.50)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    val ringOfProtection = Loot("Ring of protection", LootType.RING, 40.25)
// alternative:
// player1.inventory.add(Loot("Ring of protection", LootType.RING, 40.25))

    player1.getLoot(redPotion)
    player1.getLoot(chestArmor)
    player1.getLoot(ringOfProtection)
    player1.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
    player1.showInventory()
    println(player1.toString())

    if (player1.dropLoot(redPotion)) {
        player1.showInventory()
    } else {
        println("You don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if (player1.dropLoot(bluePotion)) {
        player1.showInventory()
    } else {
        println("You don't have ${bluePotion.name}")
    }

    if (player1.dropLoot("Invisibility Potion")) {
        player1.showInventory()
    } else {
        println("You don't have an Invisibility Potion")
    }

    val enemy = enemyobject.Enemy("test enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    // enemyobject.Troll class(sub-class) has access to enemyobject.Enemy class(super class) to use toString()
    val uglyTroll = enemyobject.Troll("Ugly enemyobject.Troll")
    println(uglyTroll)

    // uglyTroll object has access to the method of its superclass takeDamage()
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = enemyobject.Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    for (i in 1..10) {

        val dracula = enemyobject.VampireKing("Dracula")
        println(dracula)

        //the condition is being executed till the condition from the while() is true
        dracula.lives = 0

// do ... while loop
        do {
            if (dracula.dodges()) {
                // the rest of the code is skipped
                // as long the conditions from while is true
                dracula.lives += 1
                continue
            }
            if (dracula.runAway()) {
                println("Dracula ran away")
                // the condition is met,
                // the code after else is being executed
                break
            } else {
                dracula.takeDamage(12)
            }
        } while (dracula.lives > 0)
        println("===============================")
    }

//used for a set number of times
    val conan = Player("Conan")
    conan.getLoot(
        Loot(
            "Invisibility",
            LootType.POTION,
            4.0
        )
    )
    conan.getLoot(
        Loot(
            "Mithril",
            LootType.ARMOR,
            183.0
        )
    )
    conan.getLoot(
        Loot(
            "Ring of Speed",
            LootType.RING,
            25.0
        )
    )
    conan.getLoot(
        Loot(
            "Red Potion",
            LootType.POTION,
            2.0
        )
    )
    //conan.getLoot(`object`.Loot("Cursed Shield", `object`.LootType.ARMOR, -8.0))
    conan.getLoot(
        Loot(
            "Brass Ring",
            LootType.RING,
            1.0
        )
    )
    conan.getLoot(
        Loot(
            "Chain Mail",
            LootType.ARMOR,
            4.0
        )
    )

    conan.getLoot(
        Loot(
            "Gold Ring",
            LootType.RING,
            12.0
        )
    )
    conan.getLoot(
        Loot(
            "Gold Ring",
            LootType.RING,
            12.0
        )
    )
    conan.getLoot(
        Loot(
            "Gold Ring",
            LootType.RING,
            12.0
        )
    )

    conan.getLoot(
        Loot(
            "Health Potion",
            LootType.RING,
            3.0
        )
    )

    conan.getLoot(
        Loot(
            "Silver Ring",
            LootType.RING,
            6.0
        )
    )
    conan.getLoot(
        Loot(
            "Silver Ring",
            LootType.RING,
            6.0
        )
    )
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    // option 1
    val dropped = conan.dropLoot("Something not present")
    println(dropped)

    // option 2
    println(conan.dropLoot("Something else"))

    // option 3
    if (conan.dropLoot("A bit of junk")) {
        println("junk dropped")
    } else {
        println("You don't have any junk")
    }
}




