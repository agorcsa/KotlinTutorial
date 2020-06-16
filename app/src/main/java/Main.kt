
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    val enemy = Enemy("test enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    // Troll class(sub-class) has access to Enemy class(super class) to use toString()
    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)

    // uglyTroll object has access to the method of its superclass takeDamage()
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)
}

