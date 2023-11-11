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

    private boolean same = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return same;
        else if (p == null || q == null) {
            same = false;
            return false;
        } else if (p.val != q.val) same = false;

        isSameTree(p.left, q.left);
        isSameTree(p.right, q.right);

        return same;
    }
}