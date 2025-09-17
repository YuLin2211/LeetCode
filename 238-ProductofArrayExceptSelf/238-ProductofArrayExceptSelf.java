// Last updated: 9/17/2025, 11:57:12 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            if(temp <= a){
                a = temp;
            } else if (temp <= b){
                b = temp;
            } else {
                return true;
            }
        }
        return false;
    }
}