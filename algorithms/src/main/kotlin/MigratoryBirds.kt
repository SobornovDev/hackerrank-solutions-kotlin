import utils.readInt
import utils.readInts

fun main() {
    val n = readInt()
    val birds = readInts()

    val birdsMap = mutableMapOf<Int, Int>()
    var maxBird = Pair(0, 0)

    birds.forEach {
        birdsMap[it] = birdsMap.getOrPut(it) { 0 } + 1
        maxBird = compareBirds(Pair(it, birdsMap[it]!!), maxBird)
    }
    println("${maxBird.first}")
}

private fun compareBirds(birdCount: Pair<Int, Int>, currentMax: Pair<Int, Int>): Pair<Int, Int> {
    if (birdCount.second > currentMax.second)
        return birdCount
    return if (birdCount.second == currentMax.second && birdCount.first < currentMax.first)
        birdCount
    else
        currentMax
}