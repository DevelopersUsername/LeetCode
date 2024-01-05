import java.util.List;

class Solution {
    public int sumCounts(List<Integer> nums) {

        int ans = 0, count = 0, n = nums.size();
        for (int i = 0; i < n; ++i) {

            int[] subArr = new int[101];
            for (int j = i; j < n; j++) {
                if (subArr[nums.get(j)]++ == 0)
                    count++;
                ans += Math.pow(count, 2);
            }
            count = 0;
        }

        return ans;
    }
}