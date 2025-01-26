import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()
    val candles = readInts()

    val countSameCandles = mutableMapOf<Int, Int>()

    var tallestCandle = 0

    candles.forEach {
        val count = countSameCandles.getOrPut(it) { 0 }
        countSameCandles[it] = count + 1
        if (it > tallestCandle) tallestCandle = it
    }

    println("${countSameCandles[tallestCandle]}")
}