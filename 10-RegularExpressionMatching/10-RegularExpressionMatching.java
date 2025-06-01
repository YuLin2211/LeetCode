// Last updated: 6/1/2025, 11:10:30 PM
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right){
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]){
                left++;
            }
            else {
                right --;
            }
        }
        return maxArea;
    }
}