import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        List<String> list = new ArrayList<>();

        String[] words = text.split(" ");
        for (int i = 2; i < words.length; i++)
            if (words[i - 2].equals(first) && words[i - 1].equals(second))
                list.add(words[i]);

        String[] ans = new String[list.size()];

        return list.toArray(ans);
    }
}