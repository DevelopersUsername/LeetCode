class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        int ans = 0;
        int[] count = new int[51];

        for (int num : nums)
            if (++count[num] == 2)
                ans = ans ^ num;

        return ans;
    }
}