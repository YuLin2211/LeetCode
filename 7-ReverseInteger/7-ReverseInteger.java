// Last updated: 5/19/2025, 6:09:59 PM
class Solution {
    public int myAtoi(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }

        int i = 0;
        int n = s.length();
        int sign = 1;
        int result = 0;

        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '+'){
                sign = 1;
            }
            else if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}