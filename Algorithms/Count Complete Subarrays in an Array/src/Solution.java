class Solution {
    public int countCompleteSubarrays(int[] nums) {

        int ans = 0, dist = 0, l = 0, distCount = 0;
        int[] count = new int[2001];
        boolean[] distinct = new boolean[2001];

        for (int num : nums)
            if (!distinct[num]) {
                distinct[num] = true;
                distCount++;
            }

        for (int num : nums) {
            if (++count[num] == 1) dist++;
            while (dist == distCount)
                if (--count[nums[l++]] == 0) dist--;
            ans += l;
        }

        return ans;
    }
}