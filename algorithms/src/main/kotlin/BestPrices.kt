fun main() {
    val prices = readln().split(" ").map { it.toInt() }.toIntArray()
    println(getBestPrice(prices))
}

private fun getBestPrice(prices: IntArray): Int {
    var min = prices[0]
    var bestPrice = 0
    prices.forEach {
        if (it - min > bestPrice)
            bestPrice = it - min

        if (it < min)
            min = it
    }
    return bestPrice
}