import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] elems = new int[Integer.parseInt(st.nextToken())];

        int i = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            elems[i++] = Integer.parseInt(st.nextToken());

        System.out.println(dfs(convert(elems)));
        // 5
        // 4 -1 4 1 1
        // 0  1 2 3 4
    }

    private static TreeNode convert(int[] elems) {

        Map<Integer, List<TreeNode>> map = new HashMap<>();
        for (int i = 0; i < elems.length; i++) {
            if (map.containsKey(elems[i])) map.get(elems[i]).add(new TreeNode(i));
            else {
                List<TreeNode> list = new ArrayList<>();
                list.add(new TreeNode(i));
                map.put(elems[i], list);
            }
        }

        TreeNode root = map.get(-1).get(0);
        buidNode(root, map);

        return root;
    }

    private static void buidNode(TreeNode root, Map<Integer, List<TreeNode>> map) {

        if (root == null || !map.containsKey(root.val)) return;

        List<TreeNode> nodes = map.get(root.val);

        if (!nodes.isEmpty()) root.left = nodes.get(0);
        if (nodes.size() > 1) root.right = nodes.get(1);
        buidNode(root.left, map);
        buidNode(root.right, map);
    }

    private static int dfs(TreeNode root) {

        if (root == null) return -1;

        int left = dfs(root.left);
        int right = dfs(root.right);

        return Math.max(left, right) + 1;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}