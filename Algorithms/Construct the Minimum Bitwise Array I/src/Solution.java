import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        int[] ans = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++)
            ans[i] = findBitwise(nums.get(i));

        return ans;
    }

    static int findBitwise(int num) {

        for (int i = 0; i < num; i++)
            if ((i | (i + 1)) == num) return i;

        return -1;
    }
}