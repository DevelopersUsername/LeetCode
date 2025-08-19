import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private final Map<Integer, Integer> count = new HashMap<>();
    private int max;

    public int[] findFrequentTreeSum(TreeNode root) {

        dfs(root);

        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer>  entry : count.entrySet())
            if (entry.getValue() == max)
                ans.add(entry.getKey());

        return ans.stream().mapToInt(i -> i).toArray();
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;

        int val = root.val + dfs(root.left) + dfs(root.right);
        max = Math.max(max, count.merge(val, 1, Integer::sum));

        return val;
    }
}