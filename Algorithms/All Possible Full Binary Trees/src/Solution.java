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
        for (int leftCount = 0; leftCount < n; leftCount++) {

            int rightCount = n - leftCount - 1;
            for (TreeNode left : allPossibleFBT(leftCount))
                for (TreeNode right : allPossibleFBT(rightCount)) {
                    ans.add(new TreeNode(0));
                    ans.get(ans.size() - 1).left = left;
                    ans.get(ans.size() - 1).right = right;
                }
        }

        map.put(n, ans);

        return ans;
    }
}
