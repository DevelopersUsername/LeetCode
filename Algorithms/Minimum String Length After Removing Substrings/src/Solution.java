import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minLength(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {

            final char c = s.charAt(i);
            if ((c == 'B' && checkPrev(stack, 'A'))
                    || (c == 'D' && checkPrev(stack, 'C')))
                stack.pop();
            else stack.push(c);
        }

        return stack.size();
    }

    private boolean checkPrev(Deque<Character> stack, char c) {
        return !stack.isEmpty() && stack.peek() == c;
    }
}