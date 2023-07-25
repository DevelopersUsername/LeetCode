import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

    public int maxLevelSum(TreeNode root) {

        List<Integer> sumList = new ArrayList<>();

        dfs(root, 0, sumList);

        return 1 + IntStream.range(0, sumList.size())
                .reduce(0, (a, b) -> sumList.get(a) < sumList.get(b) ? b : a);
    }

    private void dfs(TreeNode root, int level, List<Integer> sumList) {

        if (root == null) return;
        if (sumList.size() == level) sumList.add(0);

        dfs(root.left, level + 1, sumList);
        sumList.set(level, sumList.get(level) + root.val);
        dfs(root.right, level + 1, sumList);
    }
}