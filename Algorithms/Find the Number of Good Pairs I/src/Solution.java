class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {

        int ans = 0;
        for (int i : nums1)
            if (i % k == 0)
                for (int j : nums2)
                    if (i % (j * k) == 0) ans++;

        return ans;
    }
}