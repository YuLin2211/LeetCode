// Last updated: 9/22/2025, 2:24:52 AM
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
    private int best = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        dfs(root, true, 0);
        dfs(root, false, 0);
        return best;
    }

    private void dfs(TreeNode node, boolean nextIsLeft, int len) {
        if (node == null) return;
        best = Math.max(best, len);

        if (nextIsLeft) {
            dfs(node.left, false, len + 1);
            dfs(node.right, true, 1);
        } else {
            dfs(node.right, true, len + 1);
            dfs(node.left, false, 1);
        }
    }
}