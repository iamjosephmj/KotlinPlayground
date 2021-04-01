package ex2

import exampleOf

fun main() {
    exampleOf("Simple Closure") {

        var counter = 0
        val incrementCounter = {
            counter += 1
        }

        incrementCounter()
        incrementCounter()
        incrementCounter()

        println(counter)
    }

    exampleOf("Closure with function") {
        fun countingLambda(): () -> Int {
            var counter = 0
            return {
                counter += 1
                counter
            }
        }

        val counter1 = countingLambda()
        val counter2 = countingLambda()

        println(counter1())
        println(counter1())

        println(counter2())
        println(counter2())
        println(counter2())
    }
}