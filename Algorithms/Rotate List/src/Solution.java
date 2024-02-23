/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (k == 0 || head == null) return head;

        ListNode start = head;
        int size = 0;
        while (start != null) {
            start = start.next;
            size++;
        }

        start = head;
        k = k % size;
        ListNode[] arr = new ListNode[size + k];
        for (int i = k; start != null; i++) {
            arr[i] = start;
            start = start.next;
        }

        for (int i = k -1; i >= 0; i--) {
            arr[i] = arr[size + i];
            arr[i].next = arr[i + 1];
        }

        arr[arr.length - 1 - k].next = null;

        return arr[0];
    }
}