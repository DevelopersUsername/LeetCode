class Solution {
    public int maximumGain(String s, int x, int y) {
        return x > y ? gain(s, "ab", x, "ba", y) : gain(s, "ba", y, "ab", x);
    }

    private int gain(String s, String sub1, int point1, String sub2, int point2) {

        int ans = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char c : s.toCharArray())
            if (!sb1.isEmpty() && sb1.charAt(sb1.length() - 1) == sub1.charAt(0) && c == sub1.charAt(1)) {
                ans += point1;
                sb1.deleteCharAt(sb1.length() - 1);
            } else sb1.append(c);

        for (char c : sb1.toString().toCharArray())
            if (!sb2.isEmpty() && sb2.charAt(sb2.length() - 1) == sub2.charAt(0) && c == sub2.charAt(1)) {
                ans += point2;
                sb2.deleteCharAt(sb2.length() - 1);
            } else sb2.append(c);


        return ans;
    }
}