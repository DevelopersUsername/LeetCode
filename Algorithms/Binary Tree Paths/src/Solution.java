import java.util.LinkedList;
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

    private final List<String> ans = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        path(root, new StringBuilder());

        return ans;
    }

    private void path(TreeNode root, StringBuilder path) {

        if (root == null) return;
        else if (root.left == null && root.right == null) {
            ans.add(path.append(root.val).toString());
            return;
        }

        int length = path.length();
        path(root.left, path.append(root.val).append("->"));
        path.setLength(length);
        path(root.right, path.append(root.val).append("->"));
        path.setLength(length);
    }
}