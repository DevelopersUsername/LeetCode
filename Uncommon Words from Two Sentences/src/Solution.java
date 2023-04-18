import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        Set<String> set = new HashSet<>(), removedSet = new HashSet<>();
        for(String word : s1.split(" ")) {
            if (set.contains(word)) {
                set.remove(word);
                removedSet.add(word);
            } else if (!removedSet.contains(word))
                set.add(word);
        }

        for(String word : s2.split(" ")) {
            if (set.contains(word)) {
                set.remove(word);
                removedSet.add(word);
            } else if (!removedSet.contains(word))
                set.add(word);
        }

        return set.toArray(new String[0]);
    }
}