import java.util.*;

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

    private static List<Integer> list;

    public int kthSmallest(TreeNode root, int k) {

        list = new ArrayList<>();
        bst(root);

        return list.get(k - 1);
    }

    private void bst(TreeNode root) {

        if (root == null) return;

        bst(root.left);
        list.add(root.val);
        bst(root.right);
    }
}