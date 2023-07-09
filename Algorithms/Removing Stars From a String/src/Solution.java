import java.util.Stack;

class Solution {
    public String removeStars(String s) {

        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            if (c == '*') stack.pop();
            else stack.push(c);

        for (Character elem : stack)
            ans.append(elem);

        return ans.toString();
    }

    public String removeStarsFast(String s) {

        StringBuilder ans = new StringBuilder();
        for (final char c : s.toCharArray())
            if (c == '*') ans.deleteCharAt(ans.length() - 1);
            else ans.append(c);

        return ans.toString();
    }
}