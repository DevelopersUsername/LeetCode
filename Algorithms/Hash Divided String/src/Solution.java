class Solution {
    public String stringHash(String s, int k) {

        int l = s.length(), hash = 0, index = 0;
        StringBuilder ans = new StringBuilder(l / k);

        for (char c : s.toCharArray()) {

            hash += c - 'a';
            if (++index == k) {
                ans.append((char) ((hash % 26) + 'a'));
                index = 0;
                hash = 0;
            }
        }

        return ans.toString();
    }
}