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
    public List<Integer> postorder(Node root) {

        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        postorder(ans, root);
        ans.add(root.val);

        return ans;
    }

    private void postorder(List<Integer> ans, Node root) {

        if (root.children == null) return;

        for (Node child : root.children) {
            postorder(ans, child);
            ans.add(child.val);
        }
    }
}