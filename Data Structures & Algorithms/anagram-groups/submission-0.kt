class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramGroups = HashMap<String, MutableList<String>>()

        for(word in strs){
            val letterCounts = IntArray(26)
            for(letter in word){
                letterCounts[letter - 'a']++
            }

            val countKey = letterCounts.joinToString(",")
            if (anagramGroups[countKey] == null){
                anagramGroups[countKey] = mutableListOf()
            }
            anagramGroups[countKey]!!.add(word)
        }
        return anagramGroups.values.toList()
    }
}
