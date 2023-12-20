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

    private final StringBuilder builder = new StringBuilder();

    public String tree2str(TreeNode root) {
        construct(root);
        return builder.toString();
    }

    private void construct(TreeNode root) {

        if (root == null) return;
        else builder.append(root.val);

        if (root.left != null) {
            builder.append("(");
            construct(root.left);
            builder.append(")");
        } else if (root.right != null)
            builder.append("(").append(")");

        if (root.right != null) {
            builder.append("(");
            construct(root.right);
            builder.append(")");
        }
    }
}