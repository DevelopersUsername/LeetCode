import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int ans = 0, cookie = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        for (int child : g)
            for (int i = cookie; i < s.length; i++)
                if (child <= s[cookie++]) {
                    ans++;
                    break;
                }

        return ans;
    }
}