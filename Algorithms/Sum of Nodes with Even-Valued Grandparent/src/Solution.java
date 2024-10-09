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

    public int sumEvenGrandparent(TreeNode root) {

        if (root == null) return ans;

        dfs(root.left, root, null);
        dfs(root.right, root, null);

        return ans;
    }

    private void dfs(TreeNode root, TreeNode parent, TreeNode grandparent) {

        if (root == null) return;

        dfs(root.left, root, parent);
        dfs(root.right, root, parent);

        if (grandparent != null && grandparent.val % 2 == 0)
            ans += root.val;
    }
}