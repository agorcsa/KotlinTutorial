package `object`

import `object`.Loot
import `object`.Weapon

class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1)

    // ArrayList
    // made private for encapsulation, to not be available from the MainKt
    private val inventory = ArrayList<Loot>()

    fun showInventory() {
        var total = 0.0
        println("$name's inventory")
        for (item in inventory) {
            println(item)
            // displays the total value of the inventory
            total += item.value
        }
        println("============")
        println("Total score is $total")
        println("============")
    }

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    // returns a String
    // Kotlin uses the overwritten toString() fun to display the players
    override fun toString(): String {
        return """
        name: $name
        lives: $lives
        level: $level
        score: $score
        weapon: $weapon
        """
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
        // code to saved the inventory goes here
    }

    // if an item of the list "inventory" exists, we remove it and return "true"
    // otherwise we return false
    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    // version 1
//    @RequiresApi(Build.VERSION_CODES.N)
//    fun dropLoot(name: String): Boolean {
//        println("$name will be dropped")
//
//        for (item in inventory) {
//             if (item.name == name) {
//                inventory.remove(item)
//                return true
//            }
//        }
//        return false
//    }

    // version 2
    fun dropLoot(name: String) : Boolean {
        var result = false
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item)
                result = true
                break
            }
        }
        return  result
    }
}



