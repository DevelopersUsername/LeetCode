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
    public boolean isUnivalTree(TreeNode root) {
        return dfs(root.left, root.val) && dfs(root.right, root.val);
    }

    private static boolean dfs(TreeNode root, int prev) {

        if (root == null) return true;
        if (root.val != prev) return false;
        else return dfs(root.left, root.val) && dfs(root.right, root.val);
    }
}