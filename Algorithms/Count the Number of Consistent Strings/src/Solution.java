import java.util.stream.Stream;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        return Stream.of(words).filter(w -> w.matches(String.format("[%s]*", allowed))).toArray().length;
    }
}