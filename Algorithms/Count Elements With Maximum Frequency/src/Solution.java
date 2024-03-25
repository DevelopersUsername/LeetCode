class Solution {
    public int maxFrequencyElements(int[] nums) {

        int ans = 0, maxFreq = 1;
        int[] t = new int[101];
        for (int num : nums)
            if (++t[num] > maxFreq) maxFreq = t[num];

        if (maxFreq == 1) return nums.length;
        else for (int i : t)
            if (i == maxFreq) ans+= maxFreq;

        return ans;
    }
}