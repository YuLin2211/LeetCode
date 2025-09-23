// Last updated: 9/23/2025, 2:14:53 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        if (root == null) return 0;
        q.add(root);
        int bestLevel = 1;
        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            int n = q.size();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                bestLevel = level;
            }
            level++;
        }
        return bestLevel;
    }
}