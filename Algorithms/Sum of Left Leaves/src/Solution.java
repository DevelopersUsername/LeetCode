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

    private int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {

        dfs(root, false);

        return ans;
    }

    private void dfs(TreeNode root, boolean isLeft) {

        if (root == null) return;
        if (isLeft && root.left == null && root.right == null) ans += root.val;

        dfs(root.left, true);
        dfs(root.right, false);
    }
}