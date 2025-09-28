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

    int ans = Integer.MIN_VALUE, maxDeep = 0;

    public int findBottomLeftValue(TreeNode root) {

        dfs(root, 1);

        return ans;
    }

    private void dfs(TreeNode root, int deep) {

        if (root == null) return;
        else if (deep > maxDeep) {
            maxDeep = deep;
            ans = root.val;
        }

        dfs(root.left, deep + 1);
        dfs(root.right, deep + 1);
    }
}