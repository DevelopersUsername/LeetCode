import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        ArrToSet(to_delete, set);
        dfs(root, ans, set, true);

        return ans;

    }

    private static void ArrToSet(int[] to_delete, Set<Integer> set) {
        for (int i : to_delete)
            set.add(i);
    }

    private static TreeNode dfs(TreeNode root, List<TreeNode> ans, Set<Integer> toDelete, boolean isRoot) {
        if (root == null) return null;

        boolean deleted = toDelete.contains(root.val);
        if (isRoot && !deleted)
            ans.add(root);

        root.left = dfs(root.left, ans, toDelete, deleted);
        root.right = dfs(root.right, ans, toDelete, deleted);

        return deleted ? null : root;
    }
}