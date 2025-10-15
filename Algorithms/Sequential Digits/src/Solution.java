import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num > high)
                return ans;
            if (low <= num)
                ans.add(num);
            int lastDigit = num % 10;
            if (lastDigit < 9)
                queue.offer(num * 10 + lastDigit + 1);
        }

        return ans;
    }
}