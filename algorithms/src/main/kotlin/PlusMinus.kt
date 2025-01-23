import utils.readInt
import utils.readInts
import java.util.Locale

fun main() {
    val n = readInt()
    val array = readInts()

    var positive = 0f
    var negative = 0f
    var zeros = 0f

    array.forEach {
        if (it > 0) {
            positive++
        } else if (it == 0)
            zeros++
        else negative++
    }

    val roundedPositive = String.format(Locale.ENGLISH, "%.6f",positive/n)
    val roundedZeros = String.format(Locale.ENGLISH, "%.6f",zeros/n)
    val roundedNegative = String.format(Locale.ENGLISH, "%.6f",negative/n)

    println("$roundedPositive\n$roundedNegative\n$roundedZeros")
}