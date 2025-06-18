import java.util.ArrayList;
import java.util.List;

class Solution {
    private static String str;

    public List<String> restoreIpAddresses(String s) {

        str = s;
        List<String> ans = new ArrayList<>();
        dfs(0, new ArrayList<>(), ans);

        return ans;
    }

    private static void dfs(int start, ArrayList<String> path, List<String> ans) {

        if (path.size() == 4 && start == str.length()) {
            ans.add(String.join(".", path));
            return;
        } else if (path.size() == 4 || start == str.length()) return;

        for (int length = 1; length <= 3; length++) {
            if (start + length > str.length()) return;
            if (length > 1 && str.charAt(start) == '0') return;

            String num = str.substring(start, start + length);
            if (Integer.parseInt(num) > 255) return;

            path.add(num);
            dfs(start + length, path, ans);
            path.remove(path.size() - 1);
        }
    }
}