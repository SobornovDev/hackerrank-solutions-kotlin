import utils.readInts

fun main() {
    val divide = readInts()[1]
    val numbers = readInts()

    var result = 0
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size)
            if ((numbers[i] + numbers[j]) % divide == 0)
                result++

    }
    println(result)
}