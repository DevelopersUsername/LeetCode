class Solution {
    public int largestCombination(int[] candidates) {

        int ans = 0, count;
        for (int i = 0; i < 24; i++) {
            count = 0;
            for (int candidate : candidates)
                if ((candidate >> i & 1) == 1)
                    count++;
            ans = Math.max(ans, count);
        }

        return ans;
    }
}