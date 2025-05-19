class Solution {
    public int myAtoi(String s) {

        if (s.isEmpty()) return 0;

        long ans = 0;
        int start = 0, sign = 1;
        char[] chars = s.toCharArray();

        while (chars[start] == ' ' && start < s.length() - 1) start++;
        if (chars[start] == '-') {
            sign = -1;
            start++;
        } else if (chars[start] == '+') start++;

        for (int i = start; i < chars.length; i++)
            if (chars[i] >= '0' && chars[i] <= '9') {
                ans = ans * 10 + (chars[i] - '0');

                if (sign * ans <= Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                if (sign * ans >= Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            } else break;

        return sign * (int) ans;
    }
}