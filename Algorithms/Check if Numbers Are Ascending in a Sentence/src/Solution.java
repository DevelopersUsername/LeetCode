class Solution {
    public boolean areNumbersAscending(String s) {

        int prev = -1, num = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= '0' && chars[i] <= '9') {

                num = 0;
                while (i < chars.length && chars[i] >= '0' && chars[i] <= '9')
                    num = num * 10 + (chars[i++] - '0');
                if (prev >= num) return false;
                else prev = num;
            }
        }

        return prev >= num;
    }
}