class Solution {
    public boolean canAliceWin(int[] nums) {

        int s = 0, d = 0;
        for (int num : nums)
            if (num < 10) s += num;
            else d += num;

        return s != d;
    }
}