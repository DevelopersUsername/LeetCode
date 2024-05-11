class Solution {
    public int countKeyChanges(String s) {

        if (s.isEmpty()) return 0;

        int ans = 0;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++)
            if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[i - 1]))
                ans++;

        return ans;
    }
}