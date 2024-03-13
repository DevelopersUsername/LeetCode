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
    private TreeNode pred = null;
    private final List<Integer> ans = new ArrayList<>();
    private final int[] count = new int[2];


    public int[] findMode(TreeNode root) {

        inorder(root);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        updateCount(root);
        inorder(root.right);
    }

    private void updateCount(TreeNode root) {
        if (pred != null && pred.val == root.val) count[0]++;
        else count[0] = 1;

        if (count[0] > count[1]) {
            count[1] = count[0];
            ans.clear();
            ans.add(root.val);
        } else if (count[0] == count[1]) ans.add(root.val);

        pred = root;
    }
}