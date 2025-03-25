import java.util.Arrays;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int n = nums.length, i = 0, larger = 0;
        int[] ans = new int[k], t = nums.clone();

        Arrays.sort(t);
        int smallest = t[n - k];
        for (int num : nums) if (num > smallest) larger++;

        int count = k - larger;
        for (int num : nums) {
            if (num > smallest) {
                ans[i++] = num;
                k--;
            } else if (num == smallest && count > 0) {
                ans[i++] = num;
                count--;
                k--;
            }
            if (k == 0) break;
        }
        return ans;
    }
}