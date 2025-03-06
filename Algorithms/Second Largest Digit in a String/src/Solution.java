import java.util.Arrays;

class Solution {
    public int secondHighest(String s) {

        int[] digits = new int[10];
        Arrays.fill(digits, -1);

        for (char c : s.toCharArray())
            if (c >= '0' && c <= '9')
                digits[c - '0']++;

        boolean firstFound = false;
        for (int i = digits.length - 1; i >= 0; i--)
            if (firstFound && digits[i] != -1) return i;
            else if (!firstFound && digits[i] != -1) firstFound = true;

        return -1;
    }
}