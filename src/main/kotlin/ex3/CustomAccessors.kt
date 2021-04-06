package ex3

import exampleOf

fun main() {
    exampleOf("simple property to a class") {
        class Person(firstName: String, lastName: String) {
            val fullName = "$firstName $lastName"
        }

        val person1 = Person("Joseph", "James")
        println(person1.fullName)
    }

    exampleOf("getter") {
        class Person(val firstName: String, val lastName: String) {
            val camelCase: String
                get() {
                    return "${firstName.capitalize()}${lastName.capitalize()}"
                }
        }

        val person1 = Person("joseph", "james")
        println(person1.camelCase)
    }

    exampleOf("setter") {
        class Person(var firstName: String, var lastName: String) {
            var camelCase: String
                get() {
                    return "${firstName.capitalize()}${lastName.capitalize()}"
                }
                set(value) {
                    firstName = value.split(" ")[0]
                    lastName = value.split(" ")[1]
                }
        }

        val person1 = Person("joseph", "james")
        println(person1.camelCase)
        person1.camelCase = "arun m"
        println(person1.camelCase)
    }
}