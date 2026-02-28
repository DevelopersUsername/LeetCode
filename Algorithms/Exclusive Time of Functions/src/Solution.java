import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int prev = 0;

        for (String log : logs) {

            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            int cur = Integer.parseInt(parts[2]);
            if (parts[1].charAt(0) == 's') {
                if (!stack.isEmpty())
                    ans[stack.peek()] += cur - prev;
                stack.push(id);
                prev = cur;
            } else {
                ans[stack.pop()] += cur - prev + 1;
                prev = cur + 1;
            }
        }

        return ans;
    }
}