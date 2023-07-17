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

    public int longestZigZag(TreeNode root) {

        zigZag(root, 0, 0);

        return ans;
    }

    private void zigZag(TreeNode root, int leftCounter, int rightCounter) {

        if (root == null) return;

        ans = Math.max(ans, Math.max(leftCounter, rightCounter));

        zigZag(root.left, rightCounter + 1, 0);
        zigZag(root.right, 0, leftCounter + 1);
    }
}