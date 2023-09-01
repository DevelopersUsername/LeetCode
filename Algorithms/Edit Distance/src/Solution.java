class Solution {
    public int minDistance(String word1, String word2) {

        if (word1.equals(word2)) return 0;

        int[][] cash = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 1; i <= word1.length(); i++) cash[i][0] = i;
        for (int i = 1; i <= word2.length(); i++) cash[0][i] = i;

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    cash[i][j] = cash[i - 1][j - 1];
                else cash[i][j] = Math.min(
                        cash[i - 1][j - 1],
                        Math.min(
                                cash[i - 1][j],
                                cash[i][j - 1])) + 1;
            }
        }

        return cash[word1.length()][word2.length()];
    }
}