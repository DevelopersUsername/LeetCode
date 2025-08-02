class Solution {
    public String removeDuplicateLetters(String s) {

        int[] count = new int[26];
        char[] ans = new char[26];
        boolean[] visited = new boolean[26];

        for (char c : s.toCharArray()) count[c - 'a']++;

        int j = 0;
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            if (visited[c - 'a']) continue;

            while (j >= 1 && ans[j - 1] > c && count[ans[j - 1] - 'a'] > 0) {
                visited[ans[j - 1] - 'a'] = false;
                j--;
            }

            visited[c - 'a'] = true;
            ans[j] = c;
            j++;
        }

        return String.valueOf(ans, 0, j);
    }
}