// Last updated: 9/20/2025, 10:50:56 PM
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
    int maxValue = Integer.MIN_VALUE;
    int count = 0;
    public int goodNodes(TreeNode root) {
        comparisionNodes(root);
        return count;
    }

    private void comparisionNodes(TreeNode root){
        if (root == null) {
            return;
        }
        int oldMax = maxValue;
        maxValue = Math.max(maxValue, root.val);
        if(root.val == maxValue){
            count++;
        }
        comparisionNodes(root.left);
        comparisionNodes(root.right);
        maxValue = oldMax;
    }
}