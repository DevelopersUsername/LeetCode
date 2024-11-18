class Solution {
    public int minOperations(String s) {
        return Math.min(minOperations(s, 0), minOperations(s, 1));
    }

    private static int minOperations(String s, int prev) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            int cur = s.charAt(i) - '0';
            if (cur == prev) {
                count++;
                prev = cur == 0 ? 1 : 0;
            } else prev = cur;
        }

        return count;
    }
}