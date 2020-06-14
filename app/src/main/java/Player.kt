class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1)

    // ArrayList
    val inventory = ArrayList<Loot>()

    fun showInventory() {
        println("$name's inventory")
        println(inventory.get(0))
        println("______________")
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
}