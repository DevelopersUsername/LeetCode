import javax.swing.tree.TreeNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] elems = new int[Integer.parseInt(st.nextToken())][3];

        int i = 0;
        for (int j = 0; j < elems.length; j++) {
            st = new StringTokenizer(br.readLine());
            elems[i++] = new int[]{
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            };
        }

        // 5
        // 4 1 2
        // 2 3 4
        // 5 -1 -1
        // 1 -1 -1
        // 3 -1 -1

        TreeNode root = new TreeNode();
        convert(root, elems, 0);

        StringBuilder builder = new StringBuilder();
        inOrder(root, builder);
        System.out.println(builder.toString());

        builder = new StringBuilder();
        preOrder(root, builder);
        System.out.println(builder.toString());

        builder = new StringBuilder();
        postOrder(root, builder);
        System.out.println(builder.toString());
    }

    private static void inOrder(TreeNode root, StringBuilder builder) {

        if (root == null) return;

        inOrder(root.left, builder);
        builder.append(root.val).append(" ");
        inOrder(root.right, builder);
    }

    private static void preOrder(TreeNode root, StringBuilder builder) {

        if (root == null) return;

        builder.append(root.val).append(" ");
        preOrder(root.left, builder);
        preOrder(root.right, builder);
    }

    private static void postOrder(TreeNode root, StringBuilder builder) {

        if (root == null) return;

        postOrder(root.left, builder);
        postOrder(root.right, builder);
        builder.append(root.val).append(" ");
    }

    private static TreeNode convert(TreeNode root, int[][] elems, int index) {

        if (index == -1) return null;

        root.val = elems[index][0];
        root.left = convert(new TreeNode(), elems, elems[index][1]);
        root.right = convert(new TreeNode(), elems, elems[index][2]);

        return root;
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