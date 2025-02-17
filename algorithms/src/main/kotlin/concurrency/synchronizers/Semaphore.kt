package concurrency.synchronizers

import java.util.concurrent.Semaphore

fun main() {
    val semaphore = Semaphore(2)
    val train = Runnable {
        val name = Thread.currentThread().name
        println("train $name, waiting trains: ${semaphore.queueLength}")
        semaphore.acquire()
        println("train $name, waiting trains: ${semaphore.queueLength}")
        Thread.sleep(5000)
        println("train $name arrived")
        semaphore.release()
    }

    repeat(5) {
        Thread(train).start()
    }
}