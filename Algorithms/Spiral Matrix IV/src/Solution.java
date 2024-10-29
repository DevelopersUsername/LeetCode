/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                ans[i][j] = -1;

        fillMatrix(ans, m, n, 0, 0, head);

        return ans;
    }

    private void fillMatrix(int[][] matrix, int m, int n, int rows, int cols, ListNode head) {

        if (head == null) return;
        for (int i = cols; i < n - cols && head != null; i++) {
            matrix[rows][i] = head.val;
            head = head.next;
        }

        if (head == null) return;
        for (int i = rows + 1; i < m - rows && head != null; i++) {
            matrix[i][n - cols - 1] = head.val;
            head = head.next;
        }

        if (head == null) return;
        for (int i = n - cols - 2; i >= cols && head != null; i--) {
            matrix[m - rows - 1][i] = head.val;
            head = head.next;
        }

        if (head == null) return;
        for (int i = m - rows - 2; i > rows && head != null; i--) {
            matrix[i][cols] = head.val;
            head = head.next;
        }

        fillMatrix(matrix, m, n, rows + 1, cols + 1, head);
    }
}