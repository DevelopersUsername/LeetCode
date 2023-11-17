import java.util.LinkedList;
import java.util.List;

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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new LinkedList<>();
        dfs(root, ans, 0);

        return ans;
    }

    private void dfs(TreeNode root, List<List<Integer>> ans, int level) {

        if (root == null) return;
        else if (ans.size() <= level) ans.add(new LinkedList<>());

        ans.get(level).add(root.val);

        dfs(root.left, ans, level + 1);
        dfs(root.right, ans, level + 1);
    }
}