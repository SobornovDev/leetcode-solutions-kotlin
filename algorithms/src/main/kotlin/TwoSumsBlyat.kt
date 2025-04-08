fun main() {
    val array = readln().split(" ").map{ it.toInt() }.toIntArray()
    val sumToFind = readln().toInt()
    val result = findTwoSum(array, sumToFind)
    result?.let {
        print("${result.first} ${result.second}")
    } ?: print("No numbers")

}

fun findTwoSum(array: IntArray, sumToFind: Int): Pair<Int, Int>? {
    val map = mutableMapOf<Int, Int>()
    array.forEach{
        val value = map.getOrPut(it) { 0 }
        map[it] = value + 1
    }

    array.forEach {
        val numToFind = sumToFind - it
        if (map[numToFind] != null)
            return it to numToFind
    }
    return null
}