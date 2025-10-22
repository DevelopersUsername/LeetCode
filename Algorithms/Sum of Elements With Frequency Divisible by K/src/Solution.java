class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        int ans = 0;
        int[] count = new int[101];

        for (int num : nums)
            count[num]++;

        for (int i = 0; i < count.length; i++)
            if (count[i] != 0 && count[i] % k == 0)
                ans += count[i] * i;

        return ans;
    }
}