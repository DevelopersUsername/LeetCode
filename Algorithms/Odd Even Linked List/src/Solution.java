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
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode oddPointer = head, evenPointer = head.next, evenNode = head.next;
        while(oddPointer.next != null && evenPointer.next != null) {

            oddPointer.next = oddPointer.next.next;
            oddPointer = oddPointer.next;

            evenPointer.next = evenPointer.next.next;
            evenPointer = evenPointer.next;
        }

        oddPointer.next = evenNode;

        return head;
    }
}