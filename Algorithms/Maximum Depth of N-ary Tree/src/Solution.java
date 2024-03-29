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

class Solution {

    private int ans = 0;
    public int maxDepth(Node root) {

        dfs(root, 1);

        return ans;
    }

    private void dfs(Node root, int depth) {

        if (root == null) return;
        else ans = Math.max(ans, depth);

        for (Node child : root.children)
            dfs(child, depth + 1);
    }
}