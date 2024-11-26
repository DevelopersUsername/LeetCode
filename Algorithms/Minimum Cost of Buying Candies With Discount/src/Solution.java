import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {

        int ans = 0;
        Arrays.sort(cost);

        for (int i = cost.length - 1; i >= 0; i--) {
            ans += cost[i--];
            if (i >= 0)
                ans += cost[i--];
        }

        return ans;
    }
}