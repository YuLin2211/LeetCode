// Last updated: 9/18/2025, 1:42:39 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int highestPoint = 0;
        int current = 0;
        for(int i = 0; i < gain.length; i++){
            current += gain[i];
            if(current > highestPoint){
                highestPoint = current;
            }
        }
        return highestPoint;
    }
}