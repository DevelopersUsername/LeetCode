import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new LinkedList<>();
        Map<Integer, double[]> map = new HashMap<>();

        dfs(root, map, 0);
        map.values().forEach(v -> ans.add(v[1] / v[0]));

        return ans;
    }

    private void dfs(TreeNode root, Map<Integer, double[]> map, int level) {

        if (root == null) return;

        map.putIfAbsent(level, new double[2]);
        double[] prev = map.get(level);
        prev[0]++;
        prev[1] += root.val;

        dfs(root.left, map, level + 1);
        dfs(root.right, map, level + 1);
    }
}