import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));
        boolean isEven = true;

        for (; !q.isEmpty(); isEven = !isEven) {
            int prevVal = isEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                if (isEven && (node.val % 2 == 0 || node.val <= prevVal)) return false;
                if (!isEven && (node.val % 2 == 1 || node.val >= prevVal)) return false;
                prevVal = node.val;
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }

        return true;
    }
}