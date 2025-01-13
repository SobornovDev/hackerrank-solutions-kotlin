import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()
    val inputArray = readInts()
    var sum = 0
    inputArray.forEach { sum += it }
    println(sum)
}