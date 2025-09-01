import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeSubfolders(String[] folder) {

        String prev = "";
        List<String> ans = new ArrayList<>();
        Arrays.sort(folder);

        for (String s : folder) {
            if (!prev.isEmpty() && s.startsWith(prev) && s.charAt(prev.length()) == '/') continue;
            prev = s;
            ans.add(s);
        }

        return ans;
    }
}