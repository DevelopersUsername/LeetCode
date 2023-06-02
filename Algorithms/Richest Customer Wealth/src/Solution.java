class Solution {
    public int maximumWealth(int[][] accounts) {

        // Time Complexity = O(n x m)
        // Space Complexity = O(1)

        int result = 0;
        int sum;

        for (int[] customer : accounts) {

            sum = 0;
            for (int bank : customer) {
                sum += bank;
            }

            result = Math.max(result, sum);
        }

        return result;
    }
}