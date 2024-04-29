class Solution {
    public long findTheArrayConcVal(int[] nums) {

        long ans = 0L;
        int l = 0, r = nums.length - 1;
        StringBuilder sb = new StringBuilder();

        while (l < r) {
            sb.append(nums[l++]).append(nums[r--]);
            ans += Integer.parseInt(sb.toString());
            sb.setLength(0);
        }

        if (l == r) ans += nums[l];

        return ans;
    }
}