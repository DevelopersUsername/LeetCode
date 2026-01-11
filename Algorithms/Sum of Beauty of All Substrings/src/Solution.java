class Solution {
    public int beautySum(String s) {

        int ans = 0, n = s.length();
        for (int i = 0; i < n; i++) {

            int[] count = new int[26];
            for (int j = i; j < n; j++) {
                count[s.charAt(j) - 'a']++;
                ans += beautyCount(count);
            }
        }

        return ans;
    }

    private static int beautyCount(int[] count) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : count)
            if (i != 0) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }

        return max - min;
    }
}