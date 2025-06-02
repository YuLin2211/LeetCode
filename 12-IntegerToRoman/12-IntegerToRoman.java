// Last updated: 6/3/2025, 12:03:48 AM
class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; num != 0; ++i) {
            
            while (num >= values[i]) {
                builder.append(romans[i]);
                num -= values[i];
            }
        }

        return builder.toString();        
    }
}