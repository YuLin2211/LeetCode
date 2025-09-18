// Last updated: 9/18/2025, 2:12:19 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> seen = new HashSet<>();
        for(int f : freq.values()){
            if(!seen.add(f)) return false;
        }
        return true;
    }
}