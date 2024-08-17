import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    private final Set<Integer> children = new HashSet<>();
    private final Map<Integer, TreeNode> nodes = new HashMap<>();

    public TreeNode createBinaryTree(int[][] descriptions) {

        for (int[] description : descriptions) {

            TreeNode parent = getNode(description[0], nodes),
                    child = getNode(description[1], nodes);
            if (description[2] == 1) parent.left = child;
            else parent.right = child;
            children.add(description[1]);
        }

        for (Map.Entry<Integer, TreeNode> entry : nodes.entrySet())
            if (!children.contains(entry.getKey()))
                return entry.getValue();

        return null;
    }

    private static TreeNode getNode(int val, Map<Integer, TreeNode> nodes) {

        TreeNode node;
        if (nodes.containsKey(val))
            node = nodes.get(val);
        else {
            node = new TreeNode(val);
            nodes.put(val, node);
        }

        return node;
    }
}