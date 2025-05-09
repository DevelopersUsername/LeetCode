import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        dfs(n, n, ans, new StringBuilder());

        return ans;
    }

    private static void dfs(int l, int r, List<String> ans, StringBuilder sb) {

        if (l == 0 && r == 0) {
            ans.add(sb.toString());
            return;
        }

        if (l > 0) {
            sb.append('(');
            dfs(l - 1, r, ans, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (r > l) {
            sb.append(')');
            dfs(l, r - 1, ans, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}