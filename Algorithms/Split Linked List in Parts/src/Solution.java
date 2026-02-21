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
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] ans = new ListNode[k];

        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }

        curr = head;
        int partLen = len / k, rem = len % k;
        for (int i = 0; i < k; i++) {
            ans[i] = curr;
            for (int j = 0; j < partLen - 1 + (rem > 0 ? 1 : 0); j++)
                if (curr == null) break;
                else curr = curr.next;

            if (curr != null) {
                ListNode temp = curr.next;
                curr.next = null;
                curr = temp;
            }
            rem--;
        }

        return ans;
    }
}