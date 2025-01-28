import utils.readInt

fun main() {
    val n = readInt()
    val grades = Array(n) { 0 }
    val result = buildString {
        for (i in 0 until n) {
            grades[i] = readInt()
            grades[i] = round(grades[i])
            append("${grades[i]}\n")
        }
    }
    println(result)
}
private fun round(grade: Int): Int {
    if (grade < 38)
        return grade
    val mod = grade / 5
    val diff = 5*(mod + 1) - grade
    return if (diff < 3)
        5*(mod + 1)
    else
        grade
}