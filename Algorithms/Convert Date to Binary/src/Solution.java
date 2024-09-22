class Solution {
    public String convertDateToBinary(String date) {

        StringBuilder ans = new StringBuilder();
        char[] chars = date.toCharArray();
        int n = 0;

        for (char c : chars)
            if (c == '-') {
                ans.append(Integer.toBinaryString(n)).append('-');
                n = 0;
            } else {
                n *= 10;
                n += c - '0';
            }

        return ans.append(Integer.toBinaryString(n)).toString();
    }
}