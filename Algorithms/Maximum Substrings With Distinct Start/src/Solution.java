class Solution {
    public int maxDistinct(String s) {

        int ans = 0;
        boolean[] visited = new boolean[26];

        for (char c : s.toCharArray()) visited[c - 'a'] = true;
        for (boolean v : visited) if (v) ans++;

        return ans;
    }
}