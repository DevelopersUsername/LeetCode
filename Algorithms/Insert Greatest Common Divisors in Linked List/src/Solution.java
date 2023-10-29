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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode ans = head, prev = head;
        head = head.next;

        while (head != null) {
            prev.next = new ListNode(gcd(prev.val, head.val), head);
            prev = head;
            head = head.next;
        }

        return ans;
    }

    private int gcd(int elem1, int elem2) {
        if (elem2 == 0) return elem1;
        else return gcd(elem2, elem1 % elem2);
    }
}