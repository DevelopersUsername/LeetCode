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

    private static int ans;

    public int maxAncestorDiff(TreeNode root) {

        if (root == null) return 0;

        ans = 0;
        maxDiff(root.left, root.val, root.val);
        maxDiff(root.right, root.val, root.val);

        return ans;
    }

    private void maxDiff(TreeNode root, int prevMax, int prevMin) {

        if (root == null) return;

        ans = Math.max(ans, Math.max(Math.abs(root.val - prevMax), Math.abs(root.val - prevMin)));
        prevMax = Math.max(prevMax, root.val);
        prevMin = Math.min(prevMin, root.val);

        maxDiff(root.left, prevMax, prevMin);
        maxDiff(root.right, prevMax, prevMin);
    }
}