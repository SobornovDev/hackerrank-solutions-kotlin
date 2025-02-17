package concurrency.synchronizers

import java.util.concurrent.CountDownLatch

fun main() {
    val latch = CountDownLatch(3)
    val worker = Runnable {
        val name = Thread.currentThread().name
        println("Current thread: $name")
        Thread.sleep(1000)
        latch.countDown()
        println("$name finished")
    }

    repeat(3) {
        Thread(worker).start()
    }

    latch.await()
    println("All threads are finished")
}