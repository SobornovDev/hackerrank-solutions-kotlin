import utils.readInts

fun main() {
    val elementsAmount = readInts()
    val firstNumbers = readInts()
    val secondsNumbers = readInts()

    val left = firstNumbers.last()
    val right = secondsNumbers[0]

    var result = 0

    for (i in left..right) {
        if (isDivide(i, firstNumbers, secondsNumbers)) result++
    }
    println(result)
}

private fun isDivide(i: Int, first: List<Int>, second: List<Int>) =
    (first.none { i % it != 0 } && second.none { it % i != 0 })
