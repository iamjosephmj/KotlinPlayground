package ex3

import exampleOf
import kotlin.properties.Delegates

class Level(id: Int, boss: String) {
    private val maxLevel = 3

    companion object {
        var highestLevel = 0
    }

    var unlocked: Boolean by Delegates.observable(false) { _, _, new ->
        if (new) {
            if (id in highestLevel..maxLevel) {
                highestLevel = id
            }
        }
    }
}

class LightBulb {
    companion object {
        const val maxCurrent = 50
    }

    var current: Int by Delegates.vetoable(0) { _, _, new ->
        if (new > maxCurrent) {
            println("flow blocked")
            false
        } else {
            println("approved $new :)")
            true
        }
    }
}

class Circle(var radius: Int) {
    val circumference: Double by lazy { 3.14 * radius * radius }
}

class Lamp {
    lateinit var bulb: LightBulb
}

fun Circle.diameter(): Long {
    return (radius * 2).toLong()
}

fun main() {
    exampleOf("Delegated.Observable") {
        val level1 = Level(id = 1, boss = "A")
        val level2 = Level(id = 2, boss = "B")
        val level3 = Level(id = 3, boss = "C")

        level1.unlocked = true
        level2.unlocked = true
        level3.unlocked = true

        println(Level.highestLevel)
    }


    exampleOf("restriction of value with vetoable") {
        val lb = LightBulb()
        lb.current = 10
        lb.current = 40
        lb.current = 60
    }

    exampleOf("by lazy") {
        val circle = Circle(10)
        println("circumference = ${circle.circumference}")
    }

    exampleOf("late init") {
        val simpleLamb = Lamp()
        simpleLamb.bulb = LightBulb()
        println(simpleLamb.bulb.current)
    }

    exampleOf("Extension function") {
        val circle = Circle(10)
        print(circle.diameter())
    }
}