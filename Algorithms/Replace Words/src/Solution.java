import java.util.Collections;
import java.util.List;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        StringBuilder ans = new StringBuilder();
        Collections.sort(dictionary);

        for (String word : sentence.split(" "))
            ans.append(getRoot(dictionary, word)).append(' ');
        ans.deleteCharAt(ans.length() - 1);

        return ans.toString();
    }

    private static String getRoot(List<String> dictionary, String derivative) {

        for (String word : dictionary)
            if (derivative.startsWith(word))
                return word;

        return derivative;
    }
}