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
    public TreeNode reverseOddLevels(TreeNode root) {

        reverse(root.left, root.right, 1);

        return root;
    }

    private void reverse(TreeNode rootLeft, TreeNode rootRight, int level) {

        if (rootLeft == null || rootRight == null)
            return;

        if (level % 2 == 1) {
            int temp = rootLeft.val;
            rootLeft.val = rootRight.val;
            rootRight.val = temp;
        }

        reverse(rootLeft.left, rootRight.right, level + 1);
        reverse(rootLeft.right, rootRight.left, level + 1);
    }
}