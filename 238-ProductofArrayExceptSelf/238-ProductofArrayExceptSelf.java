// Last updated: 9/18/2025, 1:25:46 AM
class Solution {
    public int compress(char[] chars) {
        int write = 0;
        for(int i = 0; i < chars.length;){
            char c = chars[i];
            int j = i;
            while (j < chars.length && chars[j] == c) j++;
            int count = j - i;

            chars[write++] = c;
            if (count > 1) {
                String s = Integer.toString(count);
                for (int k = 0; k < s.length(); k++){
                    chars[write++] = s.charAt(k);
                }
            }
            i = j;
        }
        return write;
    }
}