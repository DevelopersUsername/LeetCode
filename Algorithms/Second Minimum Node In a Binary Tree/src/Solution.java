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
    public int findSecondMinimumValue(TreeNode root) {

        if (root == null) return -1;

        Set<Integer> set = new HashSet<>();
        dfs(root, set);

        if (set.size() == 1) return -1;

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(1);
    }

    private static void dfs(TreeNode root, Set<Integer> set ) {

        if (root == null) return;
        set.add(root.val);
        dfs(root.left, set);
        dfs(root.right, set);
    }
}