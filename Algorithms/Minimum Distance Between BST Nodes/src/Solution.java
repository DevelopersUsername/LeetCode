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

    private int ans = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {

        dfs(root);

        for (int i = 1; i < list.size(); i++)
            ans = Math.min(ans, list.get(i) - list.get(i - 1));

        return ans;
    }

    private void dfs(TreeNode root) {

        if (root == null) return;

        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}