import java.util.List;

class Solution {
    public int minOperations(List<Integer> nums, int k) {

        if (nums.size() == k) return k;

        int[] seen = new int[k + 1];

        int ans = 0, count = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            ans++;
            int elem = nums.get(i);

            if (nums.get(i) <= k) {
                if (seen[elem] == 0) count++;
                seen[elem]++;
            }
            if (count == k) break;
        }

        return ans;
    }
}