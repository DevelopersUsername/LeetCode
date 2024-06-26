class Solution {
    public int countEven(int num) {

        int ans = 0;
        for (int i = 2; i <= num; i++)
            if (isEven(i)) ans++;

        return ans;
    }

    private static boolean isEven(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum % 2 == 0;
    }
}