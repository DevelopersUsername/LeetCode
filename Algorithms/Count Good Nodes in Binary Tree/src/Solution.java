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

    private int ans = 0;
    public int goodNodes(TreeNode root) {

        int prev = Integer.MIN_VALUE;
        countGoodNodes(root, prev);

        return ans;
    }

    private void countGoodNodes(TreeNode root, int prev) {

        if (root == null)
            return;

        if (root.val >= prev)
            ans++;

        prev = Math.max(prev, root.val);

        countGoodNodes(root.left, prev);
        countGoodNodes(root.right, prev);
    }
}