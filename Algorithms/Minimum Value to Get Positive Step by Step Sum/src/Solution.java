class Solution {
    public int minStartValue(int[] nums) {

        int ans = Integer.MAX_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum < ans) ans = sum;
        }

        return ans > 0 ? 1 : -ans + 1;
    }
}