import utils.readInt

fun main() {
    val n = readInt()

    val result = buildString {
        for (i in 0 until n) {
            for (k in 0 until n-i-1)
                append(' ')
            for (j in 0..i)
                append('#')
            append('\n')
        }
    }
    print(result)
}