package enemyobject

open class Vampire(name: String) : Enemy(name, 20, 3) {
    // overrides the takeDamage() function from the enemyobject.Enemy superclass,
    // with a modification
    // takeDamage() was made "open" to be able to be overwritten in the subclass
    override fun takeDamage(damage: Int) {
        // "super" is used to call the function from its super class
        super.takeDamage(damage / 2)
    }
}