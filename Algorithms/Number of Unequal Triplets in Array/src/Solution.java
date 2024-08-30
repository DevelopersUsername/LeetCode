class Solution {
    public int unequalTriplets(int[] nums) {

        int ans = 0, prev = 0, next = nums.length;
        int[] count = new int[1001];
        for (int num : nums)
            count[num]++;

        for (int num : count) {
            next -= num;
            ans += prev * num * next;
            prev += num;
        }

        return ans;
    }
}