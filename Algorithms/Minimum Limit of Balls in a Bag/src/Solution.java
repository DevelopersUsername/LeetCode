class Solution {
    public int minimumSize(int[] nums, int maxOperations) {

        int l = 1, r = Integer.MIN_VALUE;
        for (int num : nums) r = Math.max(r, num);

        while (l < r) {
            int m = (l + r) / 2;
            if (numOperations(nums, m) <= maxOperations) r = m;
            else l = m + 1;
        }

        return l;
    }

    private static int numOperations(int[] nums, int k) {

        int operations = 0;
        for (int num : nums) operations += (num - 1) / k;

        return operations;
    }
}