package functionssndlambdas

import exampleOf

fun main() {
    exampleOf("Function with no parameter") {
        fun printRange() {
            for (num in 1..10)
                println(num)
        }
        printRange()
    }

    exampleOf("Function with one parameter") {
        fun printRange(limit: Int) {
            for (num in 1..limit)
                println(num)
        }
        printRange(10)
    }

    exampleOf("Passing a range to the parameter") {
        fun printRange(range: IntRange) {
            for (num in range)
                println(num)
        }
        printRange(0..10)
    }


    exampleOf("Example of returning a value") {
        fun printRange(start: Int, end: Int): IntRange {
            return start..end
        }
        print(printRange(1, 10))
    }

    exampleOf("Example of arguments with names") {
        fun printRange(start: Int, end: Int, isHalfOpen: Boolean): IntRange {
            return if (isHalfOpen) {
                start until end
            } else {
                start..end
            }
        }
        print(printRange(start = 1, end = 10, false))
        print(printRange(start = 1, 10, false))
        print(printRange(1, end = 10, false))
//        print(printRange(end = 10, 10, false)) : cannot do this.
    }

    exampleOf("Default parameter") {
        fun printRange(start: Int, end: Int, isHalfOpen: Boolean = false): IntRange {
            return if (isHalfOpen) {
                start until end
            } else {
                start..end
            }
        }
        print(printRange(start = 1, end = 10))
        print(printRange(start = 1, 10))
        print(printRange(1, end = 10))
    }


}