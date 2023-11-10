/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    private int ans = Integer.MAX_VALUE;
    private int prev = -1;

    public int getMinimumDifference(TreeNode root) {

        if (root == null) return 0;

        return dfs(root);
    }

    private int dfs(TreeNode root) {

        if (root == null) return ans;

        dfs(root.left);
        if (prev != -1) ans = Math.min(ans, root.val - prev);
        prev = root.val;
        dfs(root.right);

        return ans;
    }
}