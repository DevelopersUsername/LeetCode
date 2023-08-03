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
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    private TreeNode increasingBST(TreeNode root, TreeNode prev) {

        if (root == null) return prev;

        TreeNode ans = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, prev);

        return ans;
    }
}