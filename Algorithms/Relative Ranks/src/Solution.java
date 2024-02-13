import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        String[] ans = new String[score.length];

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < score.length; i++) positions.add(i);
        positions.sort((a, b) -> score[b] - score[a]);

        for (int i = 0; i < score.length; ++i)
            if (i == 0) ans[positions.get(0)] = "Gold Medal";
            else if (i == 1) ans[positions.get(1)] = "Silver Medal";
            else if (i == 2) ans[positions.get(2)] = "Bronze Medal";
            else ans[positions.get(i)] = String.valueOf(i + 1);

        return ans;
    }
}