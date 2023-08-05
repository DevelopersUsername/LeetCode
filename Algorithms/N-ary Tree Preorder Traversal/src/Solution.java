/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorder(Node root) {

        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        preorder(ans, root);

        return ans;
    }

    private void preorder(List<Integer> ans, Node root) {

        if (root == null)
            return;

        ans.add(root.val);
        if (root.children != null) {
            for (Node child : root.children)
                preorder(ans, child);
        }
    }
}