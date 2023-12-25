import java.util.ArrayList;
import java.util.Collections;
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> ans = new ArrayList<>();
        getElements(ans, root1);
        getElements(ans, root2);
        Collections.sort(ans);

        return ans;
    }

    private void getElements(List<Integer> list, TreeNode root) {

        if (root == null) return;

        getElements(list, root.left);
        list.add(root.val);
        getElements(list, root.right);
    }
}