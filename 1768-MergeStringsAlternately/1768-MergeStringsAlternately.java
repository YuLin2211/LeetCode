// Last updated: 9/17/2025, 12:42:37 AM
class Solution {
    public String reverseVowels(String s) {
        char[] seperatedS = s.toCharArray();
        int i = 0, j = seperatedS.length - 1;

        while (i < j) {
            while (i < j && !isVowel(seperatedS[i])) i++;
            while (i < j && !isVowel(seperatedS[j])) j--;
            if (i < j) {
                char tmp = seperatedS[i];
                seperatedS[i] = seperatedS[j];
                seperatedS[j] = tmp;
                i++; j--;
            }
        }
        return new String(seperatedS);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}