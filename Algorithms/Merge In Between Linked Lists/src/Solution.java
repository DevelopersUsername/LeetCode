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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode list = list1, start;

        for (int i = 0; i < a - 1; i++) list1 = list1.next;

        start = list1;
        for (int i = a; i <= b; i++) list1 = list1.next;
        start.next = list2;

        while (list2.next != null) list2 = list2.next;
        list2.next = list1.next;

        return list;
    }
}