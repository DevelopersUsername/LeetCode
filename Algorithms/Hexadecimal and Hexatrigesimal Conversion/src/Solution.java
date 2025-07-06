class Solution {

    private static final String digits16 = "0123456789ABCDEF";
    private static final String digits36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String concatHex36(int n) {
        return integerToHex((int) Math.pow(n, 2), 16) + integerToHex((int) Math.pow(n, 3), 36);
    }

    static String integerToHex(int num, int base) {

        if (num <= 0) return "0";

        StringBuilder hex = new StringBuilder();
        while (num > 0) {
            int digit = num % base;
            hex.insert(0, base == 16 ? digits16.charAt(digit) :  digits36.charAt(digit));
            num = num / base;
        }

        return hex.toString();
    }
}