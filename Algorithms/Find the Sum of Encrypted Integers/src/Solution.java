class Solution {
    public int sumOfEncryptedInt(int[] nums) {

        int ans = 0;

        for (int num : nums)
            ans += encrypt(num);

        return ans;
    }

    private static int encrypt(int num) {

        int val = 0, count = 0;
        while (num > 0) {
            val = Math.max(val, num % 10);
            num /= 10;
            count++;
        }

        for (int i = count; i > 0; i--) {
            num *= 10;
            num += val;
        }

        return num;
    }
}