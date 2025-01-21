import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()
    val nums = readInts()
    var sum = 0L
    nums.forEach { sum += it }
    println(sum)
}