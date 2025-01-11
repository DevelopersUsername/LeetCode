class Solution {
    public boolean isGood(int[] nums) {

        int max = Integer.MIN_VALUE, n = nums.length;
        int[] base = new int[201];

        for (int num : nums) {
            base[num]++;
            max = Math.max(max, num);
        }

        if (max > n - 1 || max != n - 1 || base[max] != 2) return false;
        for (int i = 1; i < max; i++)
            if (base[i] != 1) return false;

        return true;
    }
}