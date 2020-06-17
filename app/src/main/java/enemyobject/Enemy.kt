package enemyobject

// class is declared open so that it can be extended
// and function as a superclass/ base class
open class Enemy(val name: String,
            var hitPoints: Int,
            var lives: Int) {


   open fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage

        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            // take one life
            lives -= 1
            if (lives > 0) {
                println("$name lost a life")
            } else {
                println("No lives left, $name is dead! ")
            }
        }

        // Kotlin operators
        // lives = lives + 8        lives += 8
        // lives = lives - damage   lives -= damage
        // lives = lives * 10       lives *= 10
        // lives = lives / 2        lives /= 2
        // lives = lives % 3        lives %= 2
    }

    // called in order to display the "enemyobject.Enemy" object attributes properly,
    // not using an ID assigned by Kotlin
    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
    }
}