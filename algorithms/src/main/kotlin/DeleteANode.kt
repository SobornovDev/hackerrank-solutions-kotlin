import utils.Node
import utils.readInt

fun main() {
    val countNodes = readInt()

    var head: Node<Int>? = Node(0)
    var prev: Node<Int>? = Node(0)

    for (i in 0 until countNodes) {
        val value = readInt()
        if (i == 0) {
            head = Node(value)
            prev = head
            continue
        }

        val currentNode = Node(value)
        prev!!.next = currentNode
        prev = currentNode
    }

    val nodeNumberToDelete = readInt()

    if (nodeNumberToDelete > countNodes) println("No element with such number")
    if (nodeNumberToDelete == 0) head = head?.next
    var currentNode = head
    var currentNodeNumber = 0

    while (currentNode!!.next != null && currentNodeNumber != nodeNumberToDelete) {
        prev = currentNode
        currentNode = currentNode.next!!
        currentNodeNumber++
    }

    prev!!.next = currentNode.next

    currentNode = head
    val result = buildString {
        while(currentNode != null) {
            append("${currentNode!!.value} ")
            currentNode = currentNode!!.next
        }
    }
    println(result)

}