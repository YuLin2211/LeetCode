# Last updated: 6/1/2025, 11:24:43 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        reversedNum = 0
        temp = x
        while temp != 0:
            digit = temp % 10
            reversedNum = reversedNum * 10 + digit
            temp //= 10

        return reversedNum == x