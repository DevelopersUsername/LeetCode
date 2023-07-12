import java.util.ArrayList;
import java.util.List;

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
    public ListNode reverseList(ListNode head) {

        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        for (int i = list.size() - 1; i >= 1; i--)
            list.get(i).next = list.get(i - 1);

        if (list.size() > 0) {
            head = list.get(list.size() - 1);
            list.get(0).next = null;
        }

        return head;

    }
}