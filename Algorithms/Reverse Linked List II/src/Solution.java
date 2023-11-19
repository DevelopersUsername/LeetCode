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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode ans = new ListNode(0, head), startNode = ans;
        for (int i = 1; i < left; i++) startNode = startNode.next;

        ListNode prev = null, curr = startNode.next, nextNode;
        while (curr != null && left <= right--) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        startNode.next.next = curr;
        startNode.next = prev;

        return ans.next;
    }
}