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

    private final Map<Integer, List<TreeNode>> map = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {

        if (n % 2 == 0) return new ArrayList<>();
        else if (n == 1) return List.of(new TreeNode(0));
        else if (map.containsKey(n)) return map.get(n);

        List<TreeNode> ans = new ArrayList<>();
        for (int l = 0; l < n; l++) {

            int r = n - l - 1;
            for (TreeNode left : allPossibleFBT(l))
                for (TreeNode right : allPossibleFBT(r))
                    ans.add(new TreeNode(0, left, right));
        }

        map.put(n, ans);

        return ans;
    }
}
