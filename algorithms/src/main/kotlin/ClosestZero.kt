import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()
    val houses = readInts()
    val distances = Array(n) { 0 }
    var distance = 0

    var leftPos = 0
    while (leftPos < n && houses[leftPos] != 0) {
        leftPos++
    }
    for (number in leftPos until n) {
        val currentPlace = houses[number]
        if (currentPlace != 0) {
            distance++
            distances[number] = distance
        } else distance = 0
    }
    distance = 0

    var rightPos = n-1

    while(rightPos >= 0 && distances[rightPos] != 0) {
        rightPos--
    }

    for (number in rightPos downTo leftPos) {
        val currentDistance = distances[number]
        if (currentDistance != 0) {
            distance++
            if (distance < currentDistance) {
                distances[number] = distance
            }
        } else distance = 0
    }
    distance = 0

    for (number in leftPos - 1 downTo 0) {
        distance++
        distances[number] = distance
    }

    val result = buildString{
        distances.forEach{ append("$it ") }
    }
    println(result)
}