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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    private Deep dfs(TreeNode node) {

        if (node == null) return new Deep(null, 0);

        Deep left = dfs(node.left);
        Deep right = dfs(node.right);

        if (left.deep > right.deep) return new Deep(left.node, left.deep + 1);
        if (left.deep < right.deep) return new Deep(right.node, right.deep + 1);

        return new Deep(node, left.deep + 1);
    }
}

class Deep {
    TreeNode node;
    int deep;

    Deep(TreeNode n, int d) {
        this.node = n;
        this.deep = d;
    }
}