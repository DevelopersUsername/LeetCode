class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int sum = 0, prev = 0, post = 0;
        for (int num : nums) {
            sum += num;
            post = Math.max(post, sum);
            prev = Math.min(prev, sum);
        }

        return post - prev;
    }
}