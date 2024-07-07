class Solution {
    public int numberOfAlternatingGroups(int[] colors) {

        int ans = 0, n = colors.length - 1;
        if (colors[n] != colors[0]
                && colors[0] != colors[1]) ans++;
        if (colors[n] != colors[0]
                && colors[n] != colors[n - 1]) ans++;

        for (int i = 1; i < n; i++)
            if (colors[i] != colors[i - 1]
                    && colors[i] != colors[i + 1]) ans++;

        return ans;
    }
}