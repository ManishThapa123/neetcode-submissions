class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexByNumber = HashMap<Int, Int>()
        for ((currentIndex, num) in nums.withIndex()) {
            val numNeeded = target - num
            val indexNeeded = indexByNumber[numNeeded]
            if (indexNeeded != null) {
                return intArrayOf(indexNeeded, currentIndex)
            }
            indexByNumber[num] = currentIndex
        }
        return intArrayOf()
    }
}