class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLenght = 0;
        int l = s.length();
        int start = 1;
        int currentLength = 0;
        int[] position = new int[128];

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (position[c] >= start) {
                start = position[c] + 1;
                currentLength = i + 2 - start;
            } else {
                currentLength += 1;
                longestLenght = Math.max(longestLenght, currentLength);
            }
            position[c] = i + 1;
        }
        return longestLenght;
    }
}