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
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode prev = new ListNode();
        ListNode current = head;
        ListNode next = head;

        while (next != null && next.next != null) {
            prev = current;
            current = current.next;
            next = next.next.next;
        }

        prev.next = current.next;

        return head;
    }
}