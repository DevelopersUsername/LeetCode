import java.util.ArrayList;
import java.util.List;

class Solution {
    public String simplifyPath(String path) {

        List<String> dirs = new ArrayList<>();
        for (String dir : path.split("/")) {
            if (dir.isEmpty() || dir.equals(".")) continue;
            else if (!dir.equals("..")) dirs.add(dir);
            else if (!dirs.isEmpty()) dirs.remove(dirs.size() - 1);
        }

        if (dirs.isEmpty()) return "/";

        StringBuilder ans = new StringBuilder();
        for (String s : dirs) ans.append("/").append(s);

        return ans.toString();
    }
}