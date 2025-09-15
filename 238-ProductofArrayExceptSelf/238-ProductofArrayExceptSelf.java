// Last updated: 9/15/2025, 8:38:06 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxCount = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            int i = s.charAt(right) - 'A';
            freq[i]++;
            maxCount = Math.max(maxCount, freq[i]);

            while (right - left + 1 - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
