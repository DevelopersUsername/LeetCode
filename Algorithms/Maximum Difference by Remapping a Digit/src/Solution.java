class Solution {
    public int minMaxDifference(int num) {

        String s = String.valueOf(num);

        return getMax(new StringBuilder(s), s.charAt(firstDigit(s)))
                - getMin(new StringBuilder(s), s.charAt(0));
    }

    private static int firstDigit(final String s) {

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != '9')
                return i;

        return 0;
    }

    private static int getMax(StringBuilder sb, char to) {

        for (int i = 0; i < sb.length(); i++)
            if (sb.charAt(i) == to)
                sb.setCharAt(i, '9');

        return Integer.parseInt(sb.toString());
    }

    private static int getMin(StringBuilder sb, char to) {

        for (int i = 0; i < sb.length(); i++)
            if (sb.charAt(i) == to)
                sb.setCharAt(i, '0');

        return Integer.parseInt(sb.toString());
    }
}