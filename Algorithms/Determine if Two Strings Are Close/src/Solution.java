import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length())
            return false;

        Map<Character, Integer> hashWord1 = new HashMap<>();
        for (char c : word1.toCharArray())
            hashWord1.merge(c, 1, Integer::sum);

        Map<Character, Integer> hashWord2 = new HashMap<>();
        for (char c : word2.toCharArray())
            hashWord2.merge(c, 1, Integer::sum);

        if (!hashWord1.keySet().equals(hashWord2.keySet()))
            return false;

        List<Integer> listWorld1 = new ArrayList<>(hashWord1.values());
        Collections.sort(listWorld1);

        List<Integer> listWorld2 = new ArrayList<>(hashWord2.values());
        Collections.sort(listWorld2);

        return listWorld1.equals(listWorld2);
    }
}