class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] ans = new int[2], count = new int[102];
        int index = 0;
        for (int num : nums) {
            if (++count[num] > 1) ans[index++] = num;
            if (index > 1) break;
        }

        return ans;
    }
}