import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
                ans[stack.peek()] = i - stack.pop();

            stack.push(i);
        }

        return ans;
    }
}
