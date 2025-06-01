# Last updated: 6/1/2025, 11:24:39 PM
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        c = ""
        for i in range(len(strs[0])):
            character = strs[0][i]
            for j in range(len(strs)):
                if i >= len(strs[j]) or strs[j][i] != character:
                    return c
            c += character
        
        return c
