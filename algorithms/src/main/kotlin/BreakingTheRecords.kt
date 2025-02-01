import utils.readInt
import utils.readInts

fun main() {
    val countGames = readInt()
    val gameRecords = readInts()

    var lowest = gameRecords[0]
    var lowestCount = 0
    var highest = gameRecords[0]
    var highestCount = 0

    gameRecords.forEach {
        if (lowest > it) {
            lowestCount++
            lowest = it
        }
        if (highest < it) {
            highestCount++
            highest = it
        }
    }

    println("$highestCount $lowestCount")
}