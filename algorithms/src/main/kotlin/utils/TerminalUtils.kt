package utils

fun readInt() = readln().toInt()

fun readInts() = readln().split(" ").map { it.toInt() }

fun abs(x: Int) = if (x >= 0) x else -x