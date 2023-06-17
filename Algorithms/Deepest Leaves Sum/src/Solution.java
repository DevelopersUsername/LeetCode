import java.util.ArrayList;

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
    public int deepestLeavesSum(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        leavesSum(root, 0, list);

        int ans = 0;
        if (list.size() > 0) ans = list.get(list.size() - 1);

        return ans;
    }

    private void leavesSum(TreeNode node, int level, ArrayList<Integer> list) {

        if (node == null) return;

        if (list.size() > level) list.set(level, list.get(level) + node.val);
        else list.add(node.val);

        level++;
        leavesSum(node.left, level, list);
        leavesSum(node.right, level, list);
    }
}