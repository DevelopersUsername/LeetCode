class Solution {
    public int totalWaviness(int num1, int num2) {

        if (num2 / 100 == 0) return 0;

        int ans = 0;
        for (int i = num1; i <= num2; i++)
            ans += getWaviness(i);

        return ans;
    }

    private int getWaviness(int i) {

        int count = 0;
        char[] chars = Integer.toString(i).toCharArray();

        for (int j = 1; j < chars.length - 1; j++)
            if (chars[j] > chars[j - 1] && chars[j] > chars[j + 1]
                    || chars[j] < chars[j - 1] && chars[j] < chars[j + 1])
                count++;

        return count;
    }
}