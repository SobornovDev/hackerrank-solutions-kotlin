package concurrency.synchronizers

import java.util.concurrent.CyclicBarrier

fun main() {
    val barrier = CyclicBarrier(5)

    val worker = Runnable {
        val name = Thread.currentThread().name
        println("$name started")
        Thread.sleep(1000)
        barrier.await()
        println("$name finished")
    }

    repeat(5) {
        Thread(worker).start()
    }
}