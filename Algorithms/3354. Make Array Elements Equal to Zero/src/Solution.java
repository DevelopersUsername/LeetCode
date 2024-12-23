import java.util.Arrays;

class Solution {
    public int countValidSelections(int[] nums) {

        int ans = 0, l = 0, sum = Arrays.stream(nums).sum();

        for (int num : nums)
            if (num != 0)
                l += num;
            else if (l * 2 == sum)
                ans += 2;
            else if (Math.abs(l * 2 - sum) <= 1)
                ans++;

        return ans;
    }
}