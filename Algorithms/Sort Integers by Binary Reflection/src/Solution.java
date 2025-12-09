import java.util.Arrays;

class Solution {
    public int[] sortByReflection(int[] nums) {

        int[][] t = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            t[i][0] = nums[i];
            t[i][1] = Integer.parseInt(
                    new StringBuilder(
                            Integer.toBinaryString(nums[i])).reverse().toString(),
                    2);
        }

        Arrays.sort(t, (a, b) -> (a[1] != b[1]) ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < t.length; i++) nums[i] = t[i][0];

        return nums;
    }
}