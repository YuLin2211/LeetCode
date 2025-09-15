// Last updated: 9/15/2025, 11:27:28 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
            char[] chars1 = word1.toCharArray();
            char[] chars2 = word2.toCharArray();
            char[] newWord = new char[chars1.length + chars2.length];
            int count = 0;
            int write = 0;
            if(chars1.length > chars2.length){
                count = chars1.length;
            } else {
                count = chars2.length;
            }

            for (int i = 0; i < count; i++) {
                if (i < chars1.length) {
                    newWord[write++] = chars1[i];
                }
                if (i < chars2.length) {
                    newWord[write++] = chars2[i];
                }
            }
            String sortedChar = new String(newWord);
            return sortedChar;


    }
}