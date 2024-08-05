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

    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode root = new TreeNode(preorder[0]);

        if (preorder.length == 1) return root;
        for (int i = 1; i < preorder.length; i++)
            bst(root, preorder[i]);

        return root;
    }

    private static void bst(TreeNode node, int val) {
        if (node.val < val)
            if (node.right == null) node.right = new TreeNode(val);
            else bst(node.right, val);
        else
            if (node.left == null) node.left = new TreeNode(val);
            else bst(node.left, val);
    }
}