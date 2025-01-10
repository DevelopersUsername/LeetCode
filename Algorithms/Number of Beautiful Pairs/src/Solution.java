class Solution {
    public int countBeautifulPairs(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (isBeautiful(firstDigit(nums[i]), lastDigit(nums[j])) == 1) ans++;

        return ans;
    }

    private int isBeautiful(int a, int b) {
        return b == 0 ? a : isBeautiful(b, a % b);
    }

    private static int firstDigit(int a) {

        while (a >= 10)
            a /= 10;

        return a;
    }

    private static int lastDigit(int b) {
        return b % 10;
    }
}