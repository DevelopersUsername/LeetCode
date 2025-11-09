class Solution {
    public int minimumDistance(int[] nums) {

        if (nums.length < 3) return -1;

        int ans = Integer.MAX_VALUE, n = nums.length;

        int[] count = new int[nums.length + 1];
        for (int num : nums) count[num]++;

        for (int i = 0; i < n; i++) {

            if (count[nums[i]] < 3) continue;

            int[] dist = {-1, -1};
            for (int j = i + 1; j < n && dist[1] == -1; j++)
                if (nums[i] == nums[j])
                    if (dist[0] == -1) dist[0] = j;
                    else dist[1] = j;
            int distance = (dist[0] - i) + (dist[1] - dist[0]) + dist[1] - i;
            ans = Math.min(distance, ans);
            count[nums[i]]--;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}