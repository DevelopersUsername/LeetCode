import java.util.ArrayList;
import java.util.List;

class Solution {

    private static String str;

    public List<List<String>> partition(String s) {

        str = s;
        List<List<String>> ans = new ArrayList<>();
        dfs(0, new ArrayList<>(), ans);

        return ans;
    }

    private void dfs(int start, List<String> path, List<List<String>> ans) {
        if (start == str.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < str.length(); i++)
            if (isPalindrome(start, i)) {
                path.add(str.substring(start, i + 1));
                dfs(i + 1, path, ans);
                path.remove(path.size() - 1);
            }
    }

    private boolean isPalindrome(int l, int r) {
        while (l < r)
            if (str.charAt(l++) != str.charAt(r--))
                return false;
        return true;
    }
}