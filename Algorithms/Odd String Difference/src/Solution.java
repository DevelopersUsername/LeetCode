class Solution {
    public String oddString(String[] words) {

        for (int i = 1; i < words[0].length(); i++)

            if (isDifferent(words[words.length - 1], words[0], words[1], i))
                return words[0];
            else if (isDifferent(words[0], words[words.length - 1], words[1], i))
                return words[words.length - 1];
            else
                for (int j = 1; j < words.length - 1; j++)
                    if (isDifferent(words[j - 1], words[j], words[j + 1], i))
                        return words[j];

        return "";
    }

    private static boolean isDifferent(String word_k, String word_l, String word_m, int i) {

        int k = word_k.charAt(i) - word_k.charAt(i - 1);
        int l = word_l.charAt(i) - word_l.charAt(i - 1);
        int m = word_m.charAt(i) - word_m.charAt(i - 1);

        return (l != k && l != m);
    }
}