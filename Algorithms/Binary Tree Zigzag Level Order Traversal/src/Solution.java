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

    private final List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        dfs(root, 1);

        return ans;
    }

    private void dfs(TreeNode root, int level) {

        if (root == null) return;

        if (ans.size() < level) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            ans.add(list);
        } else {
            if (level % 2 == 0) ans.get(level - 1).add(0, root.val);
            else ans.get(level - 1).add(root.val);
        }

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}