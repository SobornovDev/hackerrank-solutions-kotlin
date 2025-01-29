import utils.readInts

fun main() {
    val house = readInts()
    val trees = readInts()
    val countFruits = readInts()
    val apples = readInts().toIntArray()
    val oranges = readInts().toIntArray()

    var appleResult = 0
    var orangeResult = 0

    for (i in apples.indices) {
        apples[i] += trees[0]
        if (apples[i] <= house[1] && apples[i] >= house[0])
            appleResult++
    }
    for (i in oranges.indices) {
        oranges[i] += trees[1]
        if (oranges[i] <= house[1] && oranges[i] >= house[0])
            orangeResult++
    }
    println("$appleResult\n$orangeResult")
}