import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        int index = 0, n = nums.length;

        List<Integer> list = new ArrayList<>(k);
        Arrays.sort(nums);
        list.add(nums[n - 1]);

        int prev = nums[n - 1];
        for (int i = n - 2; i >= 0 && k > 1; i--)
            if (nums[i] != prev) {
                list.add(nums[i]);
                prev = nums[i];
                k--;
            }

        int[] ans = new int[list.size()];
        for (Integer i : list)
            ans[index++] = i;

        return ans;
    }
}