import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if (nums.length < 4) return ans;

        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = n - 1;
                while (l < r) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[l] + (long) nums[r];
                    if (sum < target) l++;
                    else if (sum > target) r--;
                    else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l++], nums[r--]));
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    }
                }
            }
        }

        return ans;
    }
}