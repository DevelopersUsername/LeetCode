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
    public int sumNumbers(TreeNode root) {

        sum(root, 0);
        return ans;
    }

    private void sum(TreeNode root, int level) {

        if (root == null) return;
        else if (root.left == null && root.right == null) {
            ans += root.val + level * 10;
            return;
        }

        sum(root.left, root.val + level * 10);
        sum(root.right, root.val + level * 10);
    }
}