package functionssndlambdas

import exampleOf

fun main() {
    exampleOf("Lambda function from variable") {
        fun operationOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
            return operation(a, b)
        }

        val additionLambda = { a: Int, b: Int ->
            a + b
        }

        println(operationOnNumbers(10, 20, additionLambda))
    }

    exampleOf("Lambda function from function") {
        fun operationOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
            return operation(a, b)
        }


        fun addTwoNums(a: Int, b: Int) = a + b

        println(operationOnNumbers(10, 20, ::addTwoNums))
    }

    exampleOf("Lambda function Inline") {
        fun operationOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
            return operation(a, b)
        }

        println(operationOnNumbers(10, 20, operation = { a, b -> a + b }))
    }



    exampleOf("Lambda function from class's function") {
        fun operationOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
            return operation(a, b)
        }

        println(operationOnNumbers(10, 20, operation = Int::plus))
    }
}