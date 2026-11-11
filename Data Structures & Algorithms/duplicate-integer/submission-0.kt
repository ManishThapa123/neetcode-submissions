class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
         val hashSet = HashSet<Int>()
         for (it in nums){
            if(hashSet.contains(it)){
                return true
            }
            hashSet.add(it)
         }
         return false
    }
}
