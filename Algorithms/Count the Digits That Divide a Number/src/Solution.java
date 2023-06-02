class Solution {
    public int countDigits(int num) {

        int result = 0;
        for (char c : String.valueOf(num).toCharArray()) {
            if (num % (c - '0') == 0) {
                result++;
            }
        }

        return result;
    }
}