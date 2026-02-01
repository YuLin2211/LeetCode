// Last updated: 2/1/2026, 9:55:03 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int n = nums.length;
5        if (n < 4) return ans;
6
7        Arrays.sort(nums);
8        long T = target;
9
10        for (int i = 0; i < n - 3; i++) {
11            if (i > 0 && nums[i] == nums[i - 1]) continue;
12            long minI = (long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
13            if (minI > T) break;
14            long maxI = (long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3];
15            if (maxI < T) continue;
16
17            for (int j = i + 1; j < n - 2; j++) {
18                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
19                long minJ = (long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2];
20                if (minJ > T) break;
21                long maxJ = (long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2];
22                if (maxJ < T) continue;
23
24                int left = j + 1, right = n - 1;
25                while (left < right) {
26                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
27                    if (sum == T) {
28                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
29                        left++;
30                        right--;
31                        while (left < right && nums[left] == nums[left - 1]) left++;
32                        while (left < right && nums[right] == nums[right + 1]) right--;
33                    } else if (sum < T) {
34                        left++;
35                    } else {
36                        right--;
37                    }
38                }
39            }
40        }
41        return ans;
42    }
43}
44