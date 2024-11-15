class Solution {
    public String largestOddNumber(String num) {

        for (int length = num.length(); length > 0; length--)
            if ((num.charAt(length - 1) - '0') % 2 != 0)
                return num.substring(0, length);

        return "";
    }
}