class Solution {
    public int findNumbers(int[] nums) {

        int ans = 0;
        for (int num : nums)
            if (isEven(num)) ans++;

        return ans;
    }

    private boolean isEven(int num) {

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        return count % 2 == 0;
    }
}