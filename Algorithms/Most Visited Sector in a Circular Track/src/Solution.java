import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {

        List<Integer> ans = new ArrayList<>();

        int start = rounds[0], end = rounds[rounds.length - 1];
        for (int i = 1; i <= n; i++)
            if (start <= i && i <= end)
                ans.add(i);
            else if (start > end && (i >= start || i <= end))
                ans.add(i);

        return ans;
    }
}