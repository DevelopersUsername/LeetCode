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
    public ListNode partition(ListNode head, int x) {

        ListNode prevHead = new ListNode(0),
                postHead = new ListNode(0),
                prev = prevHead,
                post = postHead;

        while (head != null) {

            if (head.val < x) {
                prev.next = head;
                prev = head;
            } else {
                post.next = head;
                post = head;
            }
            head = head.next;
        }

        post.next = null;
        prev.next = postHead.next;

        return prevHead.next;
    }
}