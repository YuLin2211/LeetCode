// Last updated: 9/15/2025, 8:47:28 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> counted = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (counted.containsKey(val) && counted.get(val) >= 1)
                return true;
            counted.put(val, counted.getOrDefault(val, 0) + 1);
        }
        return false;
    }
}