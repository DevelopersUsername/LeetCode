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
    public ListNode mergeNodes(ListNode head) {

        ListNode ans = new ListNode(), cur = ans, prev = ans;
        while (head != null) {
            if (head.val == 0 && cur.val != 0) {
                prev = cur;
                cur = cur.next;
            } else {
                if (cur == null) {
                    cur = new ListNode();
                    prev.next = cur;
                }

                cur.val += head.val;
            }

            head = head.next;
        }

        return ans;
    }
}