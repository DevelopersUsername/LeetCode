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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String s1 = getNumber(l1), s2 = getNumber(l2);
        ListNode head = new ListNode(), ans = head;

        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
        int carry = 0, n1 = c1.length, n2 = c2.length;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(n1, n2); i++) {

            int sum = carry;
            if (i < n1) sum += c1[i] - '0';
            if (i < n2) sum += c2[i] - '0';

            sb.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) sb.append(carry);

        String s = sb.reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            head.next = new ListNode(s.charAt(i) - '0');
            head = head.next;
        }

        return ans.next;
    }

    private static String getNumber(ListNode head) {

        StringBuilder num = new StringBuilder();
        while (head != null) {
            num.append(head.val);
            head = head.next;
        }

        return num.reverse().toString();
    }
}