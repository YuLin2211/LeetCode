// Last updated: 9/17/2025, 1:18:03 AM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        for(int i = 0; i < words.length / 2; i++){
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        return String.join(" ", words);
    }
}