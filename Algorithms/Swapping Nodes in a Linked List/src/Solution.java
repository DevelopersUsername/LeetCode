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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode firts = null, second = null, curr = head;
        while (curr != null) {
            if (second != null) second = second.next;
            if (--k == 0) {
                firts = curr;
                second = head;
            }

            curr = curr.next;
        }

        int temp = firts.val;
        firts.val = second.val;
        second.val = temp;

        return head;
    }
}