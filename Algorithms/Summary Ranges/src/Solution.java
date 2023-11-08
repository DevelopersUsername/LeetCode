import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();
        if (nums.length == 0) return ans;

        int start = nums[0], end = nums[0];
        for (int i = 1; i <= nums.length; i++) {

            if (i == nums.length) {
                addRange(ans, start, end);
                break;
            }

            if (end + 1 != nums[i]) {
                addRange(ans, start, end);
                start = nums[i];
            }
            end = nums[i];
        }

        return ans;
    }

    private void addRange(List<String> list, int start, int end) {
        if (start == end) list.add(String.valueOf(start));
        else list.add(start + "->" + end);
    }
}