import utils.readInts

private const val YES = "YES"
private const val NO = "NO"

fun main() {
    val kangaroosInfo = readInts()
    val firstKangarooLocation = kangaroosInfo[0]
    val firstKangarooSpeed = kangaroosInfo[1]
    val secondKangarooLocation = kangaroosInfo[2]
    val secondKangarooSpeed = kangaroosInfo[3]

    if (secondKangarooSpeed - firstKangarooSpeed >= 0) {
        println(NO)
        return
    }

    val t = (secondKangarooLocation - firstKangarooLocation) / (firstKangarooSpeed - secondKangarooSpeed)

    if (firstKangarooSpeed * t + firstKangarooLocation == secondKangarooSpeed * t + secondKangarooLocation)
        println(YES)
    else
        println(NO)
}