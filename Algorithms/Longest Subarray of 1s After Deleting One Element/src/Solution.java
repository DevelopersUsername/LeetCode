import java.util.ArrayList;
import java.util.List;

class Solution {
    public int longestSubarray(int[] nums) {

        int ans = 0, counter = 0;
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            if (num == 0) {
                list.add(counter);
                counter = 0;
            } else counter++;
        }

        list.add(counter);

        if (list.size() == 1) ans = list.get(0);
        else {
            for (int i = 0; i < list.size() - 1; i++)
                ans = Math.max(list.get(i) + list.get(i + 1), ans);
        }

        return Math.min(nums.length - 1, ans);
    }
}