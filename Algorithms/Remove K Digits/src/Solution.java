import java.util.LinkedList;

class Solution {
    public String removeKdigits(String num, int k) {

        if (num.length() == k) return "0";

        StringBuilder ans = new StringBuilder();
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < num.length(); i++) {
            while (k > 0 && !stack.isEmpty() && stack.getLast() > num.charAt(i)) {
                stack.pollLast();
                k--;
            }
            stack.addLast(num.charAt(i));
        }

        while (k-- > 0) stack.pollLast();

        for (char c : stack) {
            if (c == '0' && ans.isEmpty()) continue;
            ans.append(c);
        }

        return ans.isEmpty() ? "0" : ans.toString();
    }
}