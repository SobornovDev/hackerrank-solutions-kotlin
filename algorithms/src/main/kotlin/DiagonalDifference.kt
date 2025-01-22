import utils.abs
import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()

    var left = 0
    var right = 0
    for (i in 0 until n) {
        val line = readInts()
        left += line[i]
        right += line[n - 1 - i]
    }
    println(abs(right - left))
}