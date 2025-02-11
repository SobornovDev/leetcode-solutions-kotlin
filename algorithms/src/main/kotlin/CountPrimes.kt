fun main() {
    val n = readln().toInt()
    println(SolutionCP().countPrimes(n))
}

class SolutionCP {
    fun countPrimes(n: Int): Int {
        if (n < 3) return 0

        val isPrimeArray = Array(n + 1) { true }
        isPrimeArray[0] = false
        isPrimeArray[1] = false
        var result = 0

        for (num in 2 until n) {
            if (isPrimeArray[num]) {
                result++
                if (num.toLong() * num < n)
                    for (i in num * num..n step num) {
                        isPrimeArray[i] = false
                    }
            }
        }

        return result
    }
}