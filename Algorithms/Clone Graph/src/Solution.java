/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {

        if (node == null) return null;

        Queue<Node> queue = new ArrayDeque<>(List.of(node));
        Map<Node, Node> map = new HashMap<>();
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {

            Node t = queue.poll();
            for (Node d : t.neighbors) {
                if (!map.containsKey(d)) {
                    map.put(d, new Node(d.val));
                    queue.offer(d);
                }
                map.get(t).neighbors.add(map.get(d));
            }
        }

        return map.get(node);
    }
}