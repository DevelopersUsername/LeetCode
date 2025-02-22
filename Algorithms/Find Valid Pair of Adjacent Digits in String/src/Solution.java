class Solution {
    public String findValidPair(String s) {

        int[] count = new int[10];
        char[] chars = s.toCharArray();

        for (char aChar : chars) count[aChar - '0']++;

        for (int i = 1; i < chars.length; i++)
            if (chars[i] != chars[i - 1]
                    && count[chars[i] - '0'] == chars[i] - '0'
                    && count[chars[i - 1] - '0'] == chars[i - 1] - '0') {

                return String.valueOf(chars[i - 1]) + chars[i];
            }

        return "";
    }
}