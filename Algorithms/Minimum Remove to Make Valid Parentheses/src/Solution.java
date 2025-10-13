import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder ans  = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();
        boolean[] rem = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                stack.push(i);
            else if (ch == ')')
                if (!stack.isEmpty()) stack.pop();
                else rem[i] = true;
        }

        while (!stack.isEmpty()) rem[stack.pop()] = true;
        for (int i = 0; i < s.length(); i++)
            if (!rem[i])
                ans.append(s.charAt(i));

        return ans.toString();
    }
}