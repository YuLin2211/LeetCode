// Last updated: 6/3/2025, 12:01:45 AM
class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
                break;
            }
        }
        return index;
    }
}