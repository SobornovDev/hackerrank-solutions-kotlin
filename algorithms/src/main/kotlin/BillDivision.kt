import utils.readInt
import utils.readInts

fun main() {
    val refuse = readInts()[1]
    val bill = readInts()
    val b = readInt()
    var sumBill = 0

    for (i in bill.indices) {
        if (i == refuse)
            continue

        sumBill += bill[i]
    }

    if (sumBill / 2 == b)
        println("Bon Appetit")
    else
        println("${sumBill / 2 - b}")
}