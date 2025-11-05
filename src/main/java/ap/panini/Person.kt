package ap.panini

import kotlin.random.Random

data class Person(
    val age: Int,
    val name: String,
    val children: List<Person> = emptyList()
) {

    // Secondary constructor that generates random children
    constructor(age: Int, name: String, numberOfChildren: Int) : this(
        children = generateChildren(age, name, numberOfChildren),
        name = name,
        age = age
    )

    companion object {
        private fun generateChildren(age: Int, name: String, numberOfChildren: Int): List<Person> {
            val random = Random(System.currentTimeMillis())
            return List(numberOfChildren) { index ->
                val childAge = random.nextInt(1, age) // random age from 1 until age
                val childName = "${name}_child${index + 1}"
                Person(childAge, childName)
            }
        }
    }

    // Higher-order function to print children filtered by a condition
    fun printChildren(filter: (Person) -> Boolean) {
        for (child in children) {
            if (filter(child)) {
                println("Child Name: ${child.name}, Age: ${child.age}")
            }
        }
    }
}

