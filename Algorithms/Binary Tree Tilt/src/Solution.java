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

    private static int ans;
    public int findTilt(TreeNode root) {

        ans = 0;

        if (root == null) return 0;
        else dfs(root);

        return ans;
    }

    private static int dfs(TreeNode root) {

        if (root == null) return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        ans += Math.abs(left - right);

        return root.val + left + right;
    }
}