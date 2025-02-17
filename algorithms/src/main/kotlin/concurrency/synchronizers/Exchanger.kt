package concurrency.synchronizers

import java.util.concurrent.Exchanger

fun main() {
    val exchanger = Exchanger<String>()

    val producer = Runnable {
        val response = exchanger.exchange("Producer ${Thread.currentThread().name}")
        println("Receive $response, current thread is Producer=")
    }

    val consumer = Runnable {
        val response = exchanger.exchange("Consumer ${Thread.currentThread().name}")
        println("Receive $response, current thread is Consumer")
    }

    Thread(producer).start()
    Thread(consumer).start()

}