import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    public boolean dfs(String s, Set<String> wordDict, int start, Boolean[] visited) {

        if (start == s.length()) return true;
        else if (visited[start] != null) return visited[start];

        for (int end = start + 1; end <= s.length(); end++)
            if (wordDict.contains(s.substring(start, end)) && dfs(s, wordDict, end, visited))
                return visited[start] = true;

        return visited[start] = false;
    }
}