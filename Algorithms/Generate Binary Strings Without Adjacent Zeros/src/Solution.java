import java.util.ArrayList;
import java.util.List;

class Solution {

    private static List<String> ans;
    private static StringBuilder sb;

    public List<String> validStrings(int n) {

        ans = new ArrayList<>();
        sb = new StringBuilder();

        dfs(0, n);
        return ans;
    }

    private static void dfs(int i, int n) {
        if (i >= n) {
            ans.add(sb.toString());
            return;
        }

        for (int j = 0; j < 2; j++) {
            if ((j == 0 && (i == 0 || sb.charAt(i - 1) == '1')) || j == 1) {
                sb.append(j);
                dfs(i + 1, n);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}