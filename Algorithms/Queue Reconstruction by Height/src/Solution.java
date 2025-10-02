import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);

        List<int[]> ans = new ArrayList<>();
        for (int[] person : people)
            ans.add(person[1], person);

        return ans.toArray(int[][]::new);
    }
}