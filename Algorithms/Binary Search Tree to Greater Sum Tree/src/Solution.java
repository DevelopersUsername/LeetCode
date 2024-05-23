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

    private static int sum;
    public TreeNode bstToGst(TreeNode root) {

        sum = 0;
        bst(root);

        return root;
    }

    private void bst(TreeNode root) {

        if (root == null) return;

        bst(root.right);
        int val = root.val;
        root.val += sum;
        sum += val;
        bst(root.left);
    }
}