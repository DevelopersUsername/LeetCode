class Solution {
    public int maxRepeating(String sequence, String word) {

        for (int i = sequence.length() / word.length(); i > 0; --i) {
            if (sequence.contains(word.repeat(i))) {
                return i;
            }
        }

        return 0;
    }
}