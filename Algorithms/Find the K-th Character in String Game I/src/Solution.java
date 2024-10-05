class Solution {
    public char kthCharacter(int k) {

        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {

            int l = word.length();
            for (int i = 0; i < l; i++)
                word.append((char) ((word.charAt(i) + 1) % (26 + 'a')));

        }

        return word.charAt(k - 1);
    }
}