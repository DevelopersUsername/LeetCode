class Solution {
    public int minDeletionSize(String[] strs) {

        if (strs.length < 2) return 0;

        int ans = 0, columns = strs[0].length();
        for (int i = 0; i < columns; i++)
            for (int s = 1; s < strs.length; s++)
                if (strs[s].charAt(i) < strs[s - 1].charAt(i)) {
                    ans++;
                    break;
                }

        return ans;
    }
}