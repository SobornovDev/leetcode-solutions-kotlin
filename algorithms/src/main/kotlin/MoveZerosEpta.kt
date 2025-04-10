fun main() {
    val nums = readln().split(" ").map { it.toInt() }.toIntArray()
    moveZeros(nums)
    print(buildString {
        nums.forEach {
            append("$it ")
        }
    })
}


fun moveZeros(nums: IntArray) {
    var writePointer = 0
    for (readPointer in nums.indices) {
        if (nums[readPointer] != 0) {
            val proxy = nums[readPointer]
            nums[readPointer] = 0
            nums[writePointer] = proxy
            writePointer++
        }
    }
}