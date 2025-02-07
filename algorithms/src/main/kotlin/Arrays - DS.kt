import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()
    val numbers = readInts().toMutableList()

    for (i in 0 until numbers.size / 2) {
        val proxy = numbers[i]
        numbers[i] = numbers[numbers.size - i - 1]
        numbers[numbers.size - i - 1] = proxy
    }
    println(buildString {
        numbers.forEach { append("$it ") }
    }
    )
}