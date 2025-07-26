class Solution {
    public int maxProduct(String[] words) {

        int ans = 0;
        int[] hash = new int[words.length];

        for (int i = 0; i < words.length; i++)
            hash[i] = getHash(words[i]);

        for (int i = 0; i < hash.length; i++)
            for (int j = 0; j < i; j++)
                if ((hash[i] & hash[j]) == 0)
                    ans = Math.max(ans, words[i].length() * words[j].length());

        return ans;
    }

    private static int getHash(String word) {

        int mask = 0;
        for (char c : word.toCharArray())
            mask |= 1 << c - 'a';

        return mask;
    }
}