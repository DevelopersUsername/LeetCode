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

    private boolean isSymmetric = true;
    public boolean isSymmetric(TreeNode root) {

        dfs(root, root);

        return isSymmetric;
    }

    private void dfs(TreeNode rootLeft, TreeNode rootRight) {

        if (!isSymmetric) return;
        else if (rootLeft == null && rootRight == null) return;
        else if (rootLeft == null || rootRight == null || rootLeft.val != rootRight.val) {
            isSymmetric = false;
            return;
        }

        dfs(rootLeft.left, rootRight.right);
        dfs(rootLeft.right, rootRight.left);
    }
}