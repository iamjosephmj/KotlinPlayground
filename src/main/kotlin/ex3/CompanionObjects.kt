package ex3

import exampleOf

class Game {
    companion object {
        private var level: Int = 0
        var incrementLevel: Int
            get() {
                return level
            }
            set(value) {
                level += value
            }
    }
}

fun main() {
    exampleOf("Companion Objects") {
        Game.incrementLevel = 1
        Game.incrementLevel = 1

        println(Game.incrementLevel)
    }
}