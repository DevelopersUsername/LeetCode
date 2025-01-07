import java.util.List;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {

        int ans = 0, end = -1, n = nums.size();

        for (int i = 0; i < n - 1; i++)
            if (nums.get(i) > nums.get(i + 1)) {
                ans++;
                end = i;
            }

        if (ans == 0) return 0;
        else if (ans > 1 || nums.get(0) < nums.get(n - 1)) return -1;
        else return n - 1 - end;
    }
}