import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()
    val chocolateBars = readInts()
    val birthday = readInts()

    val day = birthday[0]
    val month = birthday[1]

    if (chocolateBars.size < month) {
        println(0)
        return
    }

    println(slidingWindow(chocolateBars, month, day))

}

private fun slidingWindow(bars: List<Int>, window: Int, sum: Int): Int {
    var result = 0
    var windowSum = 0
    for (i in 0 until window)
        windowSum += bars[i]
    if (windowSum == sum)
        result++

    for (i in 0 until bars.size - window) {
        windowSum = windowSum - bars[i] + bars[i + window]
        if (windowSum == sum)
            result++
    }
    return result
}