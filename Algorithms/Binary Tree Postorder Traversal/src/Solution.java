import java.util.LinkedList;
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

    private final List<Integer> ans = new LinkedList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);

            ans.add(root.val);
        }

        return ans;
    }
}