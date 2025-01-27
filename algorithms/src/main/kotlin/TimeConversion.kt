private const val PM = "PM"
private const val AM = "AM"

fun main() {
    val timeAmPm = readln()

    val format = timeAmPm.slice(timeAmPm.length - 2 until timeAmPm.length)
    val hours = timeAmPm.slice(0 until 2).toInt()
    val result = when (format) {
        PM -> {
            if (hours == 12)
                buildString {
                    append("12")
                    append(timeAmPm.slice(2 until timeAmPm.length - 2))
                } else
                buildString {
                    append("${hours + 12}")
                    append(timeAmPm.slice(2 until timeAmPm.length - 2))
                }
        }

        AM -> {
            if (hours == 12)
                buildString {
                    append("00")
                    append(timeAmPm.slice(2 until timeAmPm.length - 2))
                } else
                buildString {
                    append("0$hours")
                    append(timeAmPm.slice(2 until timeAmPm.length - 2))
                }
        }
        else -> {
            throw IllegalStateException ("Incorrect input: $timeAmPm")
        }
    }

    println(result)
}