// Last updated: 9/18/2025, 1:48:58 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];
            if (rightTotal == leftTotal) {
                return i;
            }
            leftTotal += nums[i];
        }

        return -1;        
    }
}