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
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        TreeNode ans = new TreeNode();
        dfs(root, ans);

        return ans;
    }

    private void dfs(TreeNode root, TreeNode ans) {

        if (root == null) return;
        if (root.left != null) ans.right = new TreeNode();
        if (root.right != null) ans.left = new TreeNode();

        ans.val = root.val;
        dfs(root.right, ans.left);
        dfs(root.left, ans.right);
    }
}