class Solution {
    public String intToRoman(int num) {

        StringBuilder ans = new StringBuilder();

        final String[]
                M = {"", "M", "MM", "MMM"},
                C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return ans
                .append(M[num / 1000])
                .append(C[num % 1000 / 100])
                .append(X[num % 100 / 10])
                .append(I[num % 10])
                .toString();
    }
}