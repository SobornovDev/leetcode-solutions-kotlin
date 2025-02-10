fun main() {
    val array = readln().split(" ").map { it.toInt() }.toIntArray()
    Solution().moveZeroes(array)
}

class SolutionMZ {
    fun moveZeroes(nums: IntArray){
        var writeIndex = 0
        for (readIndex in nums.indices) {
            if (nums[readIndex] != 0) {
                val buffer = nums[writeIndex]
                nums[writeIndex] = nums[readIndex]
                nums[readIndex] = buffer
                writeIndex++
            }
        }
    }
}