package ru.hse.spb

import java.util.*

class FunComparator(private val array: IntArray) : Comparator<Int> {
    override fun compare(o1: Int, o2: Int): Int {
        return array[o2] - array[o1]
    }
}

data class Data<T, D>(
        val array: T,
        val priorityQueue: PriorityQueue<D>,
        val n: Int,
        val k: Int
)

fun readData(): Data<IntArray, Int> = Scanner(System.`in`).use {
    val n = it.nextInt()
    val k = it.nextInt()

    val array = IntArray(n)
    val priorityQueue = PriorityQueue(FunComparator(array))

    for (i in 0 until n) {
        array[i] = it.nextInt()
        if (i < k) {
            priorityQueue.add(i)
        }
    }

    return Data(array, priorityQueue, n, k)
}

fun solve() {
    val (array, pq, n, k) = readData()

    var ans: Long = 0
    val seq = IntArray(n)
    for (i in 0 until n) {
        if (i + k < n)
            pq.add(i + k)
        val ind = pq.poll()
        ans += 1L * (i + k - ind).toLong() * array[ind].toLong()
        seq[ind] = i + 1 + k

    }

    println(ans)
    println(seq.joinToString(" "))

}

fun main(args: Array<String>) {
    solve()
}
