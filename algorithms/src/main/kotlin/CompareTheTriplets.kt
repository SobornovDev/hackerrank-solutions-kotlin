import utils.readInts

fun main() {
    val alicePoints = readInts()
    val bobPoints = readInts()

    var aliceScore = 0
    var bobScore = 0

    for (i in alicePoints.indices) {
        val diff = alicePoints[i] - bobPoints[i]
        if (diff > 0)
            aliceScore++
        else if (diff < 0)
            bobScore++
    }
    println("$aliceScore $bobScore")
}