// Last updated: 9/18/2025, 2:49:33 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        char[] array = t.toCharArray();
        int current = 0;
        for(int i = 0; i < array.length; i ++){
            if (array[i] == s.charAt(current)) {
                current++;
                if (current == s.length()) {
                    return true;
                }
            }
        }
        return current == s.length();
    }
}