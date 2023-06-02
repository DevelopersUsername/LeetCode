import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        int index = 0;

        for (String str : strs) {

            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sotrString = new String(temp);

            if (map.containsKey(sotrString)) {
                ans.get(map.get(sotrString)).add(str);
            } else {
                ans.add(index, new ArrayList<>(){
                    {
                        add(str);
                    }
                });
                map.put(sotrString, index++);
            }
        }

        return ans;
    }
}