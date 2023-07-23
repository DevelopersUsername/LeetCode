import java.util.HashMap;
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
    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) return 0;

        return bfs(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }

    private int bfs(TreeNode root, long sum) {

        if (root == null) return 0;

        return (sum - root.val == 0 ? 1 : 0)
                + bfs(root.left, sum - root.val)
                + bfs(root.right, sum - root.val);
    }

    // with precalculate & hashmap
    public int pathSumFast(TreeNode root, int targetSum) {

        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);

        return bfs(root, targetSum, 0L, map);
    }

    private int bfs(TreeNode node, int targetSum, long preSum, Map<Long, Integer> map) {

        if (node == null) return 0;

        preSum += node.val;

        int res = map.getOrDefault(preSum - targetSum, 0);
        map.merge(preSum, 1, Integer::sum);

        res += bfs(node.left, targetSum, preSum, map)
                + bfs(node.right, targetSum, preSum, map);
        map.merge(preSum, 1, (prev, one) -> prev - one);

        return res;
    }
}