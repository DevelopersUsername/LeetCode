class Solution {
    public int missingMultiple(int[] nums, int k) {

        int[] count = new int[101];
        for (int num : nums) count[num]++;

        for (int i = 1; i < count.length; i++)
            if (count[i] == 0 & i % k == 0) return i;

        return k * ((100 / k) + 1);
    }
}