import utils.readInt

private const val TRANSIT_CAL = 1918
fun main() {
    val year = readInt()
    if (year == TRANSIT_CAL) println("26.09.$year")
    when (checkLeap(year)) {
        true -> {
            println("12.09.$year")
        }

        false -> {
            println("13.09.$year")
        }
    }
}

private fun checkLeap(year: Int): Boolean {
    if (year % 4 != 0) return false

    if (year >= TRANSIT_CAL)
        return if (year % 400 == 0) true else if (year % 100 != 0) true else false
    return true
}