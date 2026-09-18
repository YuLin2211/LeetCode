class Solution {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        ArrayList<Integer> newNums = new ArrayList<>();
        
        for (int i = 0; i < count; i++) {
            if (i < count - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                newNums.add(nums[i]);
            }
        }

        for (int j = 0; j < newNums.size(); j++) {
            nums[j] = newNums.get(j);
        }
        
        return newNums.size();
    }
}