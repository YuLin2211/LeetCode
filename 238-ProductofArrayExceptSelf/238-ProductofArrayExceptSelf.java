// Last updated: 9/18/2025, 3:22:45 AM
class Solution {
    public int maxVowels(String s, int k) {
        char[] c = s.toCharArray();
        int count = 0;
        int answer = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(c[i])){
                count++;
            }
        }

        answer = Math.max(answer, count);
        if (answer == k) return answer;

        for(int i = k; i < c.length; i++){
            if(isVowel(c[i])){
                count++;
            }
            if (isVowel(c[i-k])){
                count--;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}