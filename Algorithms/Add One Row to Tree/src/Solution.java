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

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (root == null) return new TreeNode(val);
        if (depth == 1) return new TreeNode(val, root, null);

        dfs(root, val, depth);

        return root;
    }
    private void dfs(TreeNode root, int val, int depth) {

        if (root == null) return;
        if (depth == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        } else {
            dfs(root.left, val, depth - 1);
            dfs(root.right, val, depth - 1);
        }
    }
}