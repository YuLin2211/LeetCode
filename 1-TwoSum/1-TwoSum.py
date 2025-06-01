# Last updated: 6/1/2025, 11:24:47 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for x in range(len(nums) - 1):
            for j in range(x + 1, len(nums)):
                if nums[x] + nums[j] == target:
                    return [x, j]
        return []