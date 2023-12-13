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

    private int ans = 0;

    public int sumRootToLeaf(TreeNode root) {

        if (root == null) return 0;
        else sum(root, new StringBuilder());

        return ans;
    }

    private void sum(TreeNode root, StringBuilder builder) {

        if (root == null) return;
        else builder.append(root.val);

        if (root.left == null && root.right == null)
            ans += Integer.parseInt(builder.toString(), 2);

        sum(root.left, builder);
        sum(root.right, builder);
        builder.delete(builder.length() - 1, builder.length());
    }
}