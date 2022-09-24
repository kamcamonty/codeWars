//Task description: https://www.codewars.com/kata/5541f58a944b85ce6d00006a
package prodfib

fun productFib(num:Long):LongArray {
    println(num)
    var fib = mutableListOf<Long>()

    var t1: Long = 0
    var t2: Long = 1
    var prod: Long = 0

    while (prod < num) {
        val sum: Long = t1 + t2
        prod = t1 * t2
        t1 = t2
        t2 = sum
        fib.add(t1)
    }
    var result = longArrayOf(fib[fib.size - 2], fib[fib.size - 1], 0)
    if (prod == num) result[2] = 1
    return result
}