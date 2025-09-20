// Last updated: 9/20/2025, 11:43:56 PM
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
    public int pathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, false);
    }
    private int helper(TreeNode node, long target, boolean inPath) {
        if(node == null){
            return 0;
        }
        int res = 0;
        if (inPath) {
            if (node.val == target) res++;
            res += helper(node.left, target - node.val, true);
            res += helper(node.right, target - node.val, true);
        } else {
            int startHere = (node.val == target ? 1 : 0)
                    + helper(node.left, target - node.val, true)
                    + helper(node.right, target - node.val, true);
            int skipHere = helper(node.left, target, false)
                    + helper(node.right, target, false);
            res = startHere + skipHere;
        }
        return res;
    }
}