class Solution {
    public int numberOfSteps(int num) {

        // Time Complexity = O(logn)
        // Space Complexity = O(1)

        int result = 0;

        while (num > 0) {

            if ((num & 1)  == 0) {
                num >>= 1;
            } else {
                num--;
            }
            result++;
        }

        return result;
    }
}