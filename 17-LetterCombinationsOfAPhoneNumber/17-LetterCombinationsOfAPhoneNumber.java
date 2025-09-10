// Last updated: 9/10/2025, 1:14:27 AM
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();

        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        List<String> res = new ArrayList<>();
        res.add("");

        for (int i = 0; i < digits.length(); i++) {
            String letters = map[digits.charAt(i) - '0'];
            List<String> next = new ArrayList<>(res.size() * letters.length());
            for (String prefix : res) {
                for (int j = 0; j < letters.length(); j++) {
                    next.add(prefix + letters.charAt(j));
                }
            }
            res = next;
        }
        return res;
    }
}