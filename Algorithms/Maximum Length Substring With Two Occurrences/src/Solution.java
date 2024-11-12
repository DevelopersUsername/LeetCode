class Solution {
    public int maximumLengthSubstring(String s) {

        int ans = 0, l = 0, r = 0;
        int[] count = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars) {

            int elem = c - 'a';
            if (++count[elem] > 2)
                while (count[elem] > 2)
                    count[chars[l++] - 'a']--;

            ans = Math.max(ans, r++ - l + 1);
        }

        return ans;
    }
}