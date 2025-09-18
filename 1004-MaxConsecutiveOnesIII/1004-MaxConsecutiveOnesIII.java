// Last updated: 9/18/2025, 2:05:19 PM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        List<Integer> list1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.remove(num)) {
                list1.add(num);
            }
        }
        List<Integer> list2 = new ArrayList<>(set2);
        return Arrays.asList(list1, list2);
    }
}
