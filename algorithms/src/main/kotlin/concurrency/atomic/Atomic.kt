package concurrency.atomic

import java.util.concurrent.Callable
import java.util.concurrent.CyclicBarrier
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

fun main() {
    val maxThreads = Runtime.getRuntime().availableProcessors()
    val executor = Executors.newFixedThreadPool(maxThreads)
    val counter = Counter()
    val barrier = CyclicBarrier(maxThreads)
    val worker = Callable {
        println("${Thread.currentThread().name} started")
        counter.increment()
        Thread.sleep(1000)
        println("${Thread.currentThread().name} finished, counter = ${counter.get()}")
        barrier.await()
    }
    val workers = mutableListOf<Callable<Int>>()

    repeat(100) {
        workers.add(worker)
    }

    val futures = executor.invokeAll(workers)

    executor.shutdown()

    println("Counter is ${counter.get()}")


}

internal class Counter {
    private val counter = AtomicInteger(0)

    fun increment() {
        counter.getAndIncrement()
    }

    fun get() = counter.get()
}