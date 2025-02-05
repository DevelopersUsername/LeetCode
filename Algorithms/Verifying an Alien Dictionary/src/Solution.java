class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        char[] dictionary = new char[26];
        for (int i = 0; i < 26; i++)
            dictionary[order.charAt(i) - 'a'] = (char) (i + 'a');

        for (int i = 0; i + 1 < words.length; i++)
            if (check(words[i], words[i + 1], dictionary))
                return false;

        return true;
    }

    private static boolean check(String s1, String s2, char[] dictionary) {

        for (int i = 0; i < s1.length() && i < s2.length(); i++)
            if (s1.charAt(i) != s2.charAt(i))
                return dictionary[s1.charAt(i) - 'a'] > dictionary[s2.charAt(i) - 'a'];

        return s1.length() > s2.length();
    }
}