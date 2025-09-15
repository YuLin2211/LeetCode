// Last updated: 9/15/2025, 11:08:59 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> groupedAnagrams = new HashMap<>();

            for(int i = 0; i < strs.length; i++){
                String word = strs[i];
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedChar = new String(chars);

                if(!groupedAnagrams.containsKey(sortedChar)){
                    groupedAnagrams.put(sortedChar, new ArrayList<>());
                }
                groupedAnagrams.get(sortedChar).add(word);
            }
            return new ArrayList<>(groupedAnagrams.values());

    }
}