import java.util.ArrayList;
import java.util.List;

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, new ArrayList<>(), ans, 0, targetSum);

        return ans;
    }

    private void dfs(TreeNode root, ArrayList<Integer> path, List<List<Integer>> ans, int sum, int targetSum) {

        if (root == null) return;

        if (root.val + sum == targetSum && root.left == null && root.right == null) {
            path.add(root.val);
            ans.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        path.add(root.val);
        dfs(root.left, path, ans, sum + root.val, targetSum);
        dfs(root.right, path, ans, sum + root.val, targetSum);
        path.remove(path.size() - 1);
    }
}