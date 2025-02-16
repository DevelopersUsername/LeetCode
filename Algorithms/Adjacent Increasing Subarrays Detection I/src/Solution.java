import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        int pos = 1,  prev = 0;

        for (int i = 1; i < nums.size(); ++i) {
            if (nums.get(i) > nums.get(i - 1))
                pos++;
            else {
                prev = pos;
                pos = 1;
            }

            if (pos / 2 >= k || Math.min(prev, pos) >= k)
                return true;
        }

        return false;
    }
}