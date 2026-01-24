import java.util.ArrayList;
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
    public TreeNode balanceBST(TreeNode root) {

        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);

        return balance(nums, 0, nums.size() - 1);
    }

    private void inorder(TreeNode root, List<Integer> nums) {

        if (root == null) return;

        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }

    private TreeNode balance(List<Integer> nums, int l, int r) {
        if (l > r) return null;

        int m = (l + r) / 2;

        return new TreeNode(nums.get(m), balance(nums, l, m - 1), balance(nums, m + 1, r));
    }
}