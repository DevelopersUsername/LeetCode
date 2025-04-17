class Solution {
    public int maxSum(int[] nums) {

        int ans = 0, n = 101, elements = 0;
        int[] count = new int[n], neg = new int[n];

        for (int num : nums)
            if (num > 0) count[num]++;
            else neg[-num]++;

        for (int i = 0; i < n; i++)
            if (count[i] > 0) {
                ans += i;
                elements++;
            }

        if (elements == 0)
            for (int i = 0; i < n; i++)
                if (neg[i] > 0) return -i;

        return ans;
    }
}