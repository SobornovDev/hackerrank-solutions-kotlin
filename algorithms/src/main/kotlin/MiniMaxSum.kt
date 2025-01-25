import utils.readLongs

fun main() {
    val numbers = readLongs()
    var min = numbers[0]
    var max = numbers[0]
    var sum = 0L

    numbers.forEach {
        if (it > max)
            max = it
        if (it < min)
            min = it
        sum += it
    }

    println("${sum - max} ${sum - min}")
}