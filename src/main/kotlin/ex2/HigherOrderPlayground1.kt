package ex2

import exampleOf

fun main() {

    val prices = arrayOf(1.50, 10.00, 4.99, 2.30, 8.19)

    exampleOf("`forEach` as a `for` loop") {
        prices.forEach(::println)
    }

    exampleOf("`map` - Loops over an collection, executes lambda code, returns a new collection") {
        prices.map {
            it * .2
        }.forEach(::println)
    }

    exampleOf("`mapNotNull`") {
        val userInput = listOf("meow!", "15", "37.5", "seven", "42")

        userInput.map { it.toIntOrNull() }.forEach(::println)

        println("-----")
        userInput.mapNotNull { it.toIntOrNull() }.forEach(::println)
    }

}