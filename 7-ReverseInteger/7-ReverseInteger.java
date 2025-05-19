// Last updated: 5/19/2025, 6:11:21 PM
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while(x != 0){
            int pop = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // underflow
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }
}