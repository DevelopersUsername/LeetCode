class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder ans = new StringBuilder(words.length);
        for (String word : words)
            ans.append(wordWeight(word, weights));

        return ans.toString();

    }

    private char wordWeight(String word, int[] weights) {

        int weight = 0;
        for (char c : word.toCharArray())
            weight += weights[c - 'a'];

        return (char) ((25 - (weight % 26)) + 'a');
    }
}