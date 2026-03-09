class Solution {
    public int[] minDistinctFreqPair(int[] nums) {

        int[] counts = new int[101];
        for (int num : nums)
            counts[num]++;

        int l = 0, r = 0, lFreq = 0;
        for (int i = 0; i < counts.length; i++) {
            if (l == 0 && counts[i] != 0) {
                lFreq = counts[i];
                l = i;
            } else if (l != 0 && counts[i] != 0 && counts[i] != lFreq) {
                r = i;
                break;
            }
        }

        if (l != 0 && r != 0)
            return new int[]{l, r};

        return new int[]{-1, -1};
    }
}