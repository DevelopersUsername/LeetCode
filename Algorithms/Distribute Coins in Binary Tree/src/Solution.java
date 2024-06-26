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

    public int distributeCoins(TreeNode root) {

        dfs(root);

        return ans;
    }

    private int dfs(TreeNode root) {

        if (root == null) return 0;

        int l = dfs(root.left);
        int r = dfs(root.right);

        ans += Math.abs(l) + Math.abs(r);

        return root.val + l + r - 1;
    }
}