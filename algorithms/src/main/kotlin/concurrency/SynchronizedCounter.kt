package concurrency

import java.time.Duration
import java.time.Instant


fun main() {
    val start = Instant.now()
    val counter = Counter()
    val thread1 = Runnable {
        for (i in 0 until 10000) {
            counter.increment()
        }
    }
    val thread2 = Runnable {
        for (i in 0 until 10000) {
            counter.increment()
        }
    }

    val thread3 = Runnable {
        for (i in 0 until 10000) {
            counter.increment()
        }
    }

    val execThread1 = Thread(thread1)
    val execThread2 = Thread(thread2)
    val execThread3 = Thread(thread3)

    execThread1.start()
    execThread2.start()
    execThread3.start()

    execThread1.join()
    execThread2.join()
    execThread3.join()

    println(counter.getCounter())
    val end = Instant.now()
    println("${Duration.between(start, end).toMillis()} мс")
}

internal class Counter {
    private var counter = 0

    @Synchronized
    fun increment() = counter++

    fun getCounter() = counter
}