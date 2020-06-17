package enemyobject

class VampireKing(name: String) : Vampire(name) {

    // executed at the time when we create the instance
    // alters the value of hitPoints for a vampireKing object from 20 to 140.
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    // if lives < 2 => returns true
    // else => returns false
    // Dracula will run away if he looses too many lives and only 2 left
    fun runAway(): Boolean {
        return lives < 2
    }

    // dodge = avoids
    fun dodges(): Boolean {
        // assigns a random number
        val rand = java.util.Random()
        // we will get a value between 0 -> 5
        val chance = rand.nextInt(6)
        // 1/3 chance of dodging a blow
        if (chance > 3) {
            println("Dracula dodges")
            return true
        } else {
            return true
        }
    }
}