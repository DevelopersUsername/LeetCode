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
public class Solution {

    private TreeNode prev = null, first = null, second = null;

    public void recoverTree(TreeNode root) {
        search(root);
        swap(first, second);
    }

    private void search(TreeNode root) {

        if (root == null) return;

        search(root.left);

        if (prev != null && root.val < prev.val) {
            second = root;
            if (first == null) first = prev;
            else return;
        }

        prev = root;

        search(root.right);
    }

    private void swap(TreeNode first, TreeNode second) {
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}