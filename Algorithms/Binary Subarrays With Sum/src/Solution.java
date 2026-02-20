class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0, prefix = 0;

        int[] count = new int[nums.length + 1];
        count[0] = 1;

        for (int num : nums) {
            prefix += num;
            if (prefix >= goal)
                ans += count[prefix - goal];
            count[prefix]++;
        }

        return ans;
    }
}