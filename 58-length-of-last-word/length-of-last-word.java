class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int lastCount = 0;
        char space = ' ';
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == space){
                if(count > 0){
                    lastCount = count;
                }
                count = 0;
            }
            else{
                count++;
            }
        }
        if(count > 0){
            lastCount = count;
        }
        
        return lastCount;
    }
}