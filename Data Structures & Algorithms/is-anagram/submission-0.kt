class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val frequency = IntArray(26)
        for (char in s){
            frequency[char - 'a']++
        }
         for (char in t){
            frequency[char - 'a']--
        }
        for (num in frequency){
            if (num != 0) return false
        }
    return true
    }
}
