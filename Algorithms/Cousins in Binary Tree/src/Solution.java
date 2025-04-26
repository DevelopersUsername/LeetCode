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

    TreeNode parent1 = null, parent2 = null;
    int depth1 = 0, depth2 = 0;
    public boolean isCousins(TreeNode root, int x, int y) {

        dfs(root, null, x, y, 0);
        return parent1 != parent2 && depth1 == depth2;
    }

    private void dfs(TreeNode root, TreeNode parent, int x, int y, int depth) {

        if (root == null) return;

        if (root.val == x) {
            depth1 = depth;
            parent1 = parent;
        } else if (root.val == y) {
            depth2 = depth;
            parent2 = parent;
        }

        dfs(root.left, root, x, y, depth + 1);
        dfs(root.right, root, x, y, depth + 1);
    }
}