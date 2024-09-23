class Solution {
    public int generateKey(int num1, int num2, int num3) {

        int ans = 0;
        for (int i = 0, index = 1; i < 4; i++, index *= 10, num1 /= 10, num2 /= 10, num3 /= 10)
            ans += Math.min(Math.min(num1 % 10, num2 % 10), num3 % 10) * index;

        return ans;
    }
}