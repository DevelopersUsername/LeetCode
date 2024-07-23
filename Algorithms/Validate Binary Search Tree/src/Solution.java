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
    public boolean isValidBST(TreeNode root) {

        if (root == null) return true;
        else return isValidBST(root, null, null);
    }

    private static boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {

        if (root == null) return true;
        else if (minNode != null && root.val <= minNode.val) return false;
        else if (maxNode != null && root.val >= maxNode.val) return false;
        else return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
    }
}