import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Solution {

    private static final Map<Character, String> nextLetters = Map.of(
            'a', "bc",
            'b', "ac",
            'c', "ab");

    public String getHappyString(int n, int k) {

        Queue<String> queue = new ArrayDeque<>(List.of("a", "b", "c"));
        while (queue.peek().length() != n) {
            String cur = queue.poll();
            for (char next : nextLetters.get(cur.charAt(cur.length() - 1)).toCharArray())
                queue.add(cur + next);
        }

        if (queue.size() < k) return "";
        for (int i = 0; i < k - 1; i++) queue.poll();

        return queue.poll();
    }
}