package ap.panini

import java.util.ArrayList

fun main() {
    val human = Person(25, "bob2", 10)
    println(human)


    val humans = List(10) { if (it % 2 == 0) null else Person(it, "bob_$it", 0) }
    println(humans.joinToString("\n"))


    println(humans[2])

    val nums = listOf(2, 5, 1, 6, 2, 15)

    println(nums)
    println(nums.add10().add10().add10())
    println(add10(add10(add10(nums))))
}

fun List<Int>.add10(): List<Int> {
    return map { num -> num + 10 }
}

fun add10(nums: List<Int>): List<Int> {
    return nums.map { num -> num + 10 }
}
