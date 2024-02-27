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

/*
3
2 1 2
1 -1 -1
3 -1 -1
yes

3
1 1 2
2 -1 -1
3 -1 -1
no

3
2 1 2
1 -1 -1
2 -1 -1
yes

3
2 1 2
2 -1 -1
3 -1 -1
no

1
2147483647 -1 -1
yes


4
2 -1 1
2 2 3
1 -1 -1
3 -1 -1
no

*/

        TreeNode root = new TreeNode();
        System.out.println(isValid(convert(root, elems, 0), null, null) ? "yes" : "no");
    }

    private static boolean isValid(TreeNode root, Integer minParent, Integer maxParent) {

        if (root == null) return true;

        if ((maxParent != null && root.val >= maxParent)
                || (minParent != null && root.val < minParent)) return false;

        return isValid(root.left, minParent, root.val)
                && isValid(root.right, root.val, maxParent);
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