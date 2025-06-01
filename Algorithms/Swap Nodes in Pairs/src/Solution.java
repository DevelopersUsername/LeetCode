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
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode ans = new ListNode();
        swap(ans, head);

        return ans.next;
    }

    private static void swap(ListNode prev, ListNode curr) {

        if (curr == null || curr.next == null) return;

        ListNode next = curr.next;
        prev.next = next;
        curr.next = next.next;
        next.next = curr;

        swap(curr, curr.next);
    }
}