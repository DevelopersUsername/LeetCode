class Solution {
    public String customSortString(String order, String s) {

        int[] count = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;

        StringBuilder ans = new StringBuilder();
        for (char c : order.toCharArray())
            while (count[c - 'a']-- > 0)
                ans.append(c);

        for (char c = 'a'; c <= 'z'; c++)
            while (count[c - 'a']-- > 0)
                ans.append(c);

        return ans.toString();
    }
}