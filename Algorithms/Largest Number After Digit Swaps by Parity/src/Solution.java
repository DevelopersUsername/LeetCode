class Solution {
    public int largestInteger(int num) {

        StringBuilder builder = new StringBuilder();
        int[] digits = getDigits(num);
        while (num > 0) {
            int digit = num % 10;
            for (int i = 0; i < digits.length; i++)
                if (digits[i] > 0 && (i) % 2 == digit % 2) {
                    digits[i]--;
                    builder.append(i);
                    break;
                }
            num /= 10;
        }

        return Integer.parseInt(builder.reverse().toString());
    }

    private static int[] getDigits(int num) {
        int[] digits = new int[10];
        while (num > 0) {
            digits[num % 10]++;
            num /= 10;
        }

        return digits;
    }
}