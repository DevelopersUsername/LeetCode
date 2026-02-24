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

    private TreeNode ans;
    private int maxDepth = -1;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    private int dfs(TreeNode root, int depth) {
        if (root == null) {
            maxDepth = Math.max(depth, maxDepth);
            return depth;
        }

        int left = dfs(root.left, depth + 1);
        int right = dfs(root.right, depth + 1);
        if (left == maxDepth && right == maxDepth) ans = root;

        return Math.max(left, right);
    }
}