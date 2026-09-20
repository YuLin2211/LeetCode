class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        for(int i = digits.length - 1; i >= 0; i--){
            if(carry == false){
                if(digits[i] == 9){
                    digits[i] = 0;
                    carry = true;
                }
                else{
                    digits[i] = digits[i] + 1;
                    break;
                }
                if(i != 0){
                    carry = false;
                }
            }
        }
        if(carry == true){
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for(int i = 1; i < newDigits.length; i++){
                newDigits[i] = 0;
            }
            return newDigits;
        }
        else{
            return digits;
        }
    }
}