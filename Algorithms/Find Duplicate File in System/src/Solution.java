import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] words = path.split(" ");
            String rootPath = words[0];
            for (int i = 1; i < words.length; ++i) {
                String fileInfo = words[i];
                int l = fileInfo.indexOf('('), r = fileInfo.indexOf(')');
                String fileName = fileInfo.substring(0, l);
                String data = fileInfo.substring(l + 1, r);
                String filePath = rootPath + '/' + fileName;
                map.putIfAbsent(data, new ArrayList<>());
                map.get(data).add(filePath);
            }
        }

        for (List<String> filePaths : map.values())
            if (filePaths.size() > 1)
                ans.add(filePaths);

        return ans;
    }
}