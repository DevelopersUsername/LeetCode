class Solution {
    public int similarPairs(String[] words) {

        int ans = 0;
        int[][] count = new int[words.length][26];
        for (int i = 0; i < words.length; i++)
            for (char c : words[i].toCharArray())
                count[i][c - 'a'] = 1;

        for (int i = 0; i < words.length -1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                boolean similar = true;
                for (int k = 0; k < 26; k++) {
                    if (count[j][k] != count[i][k]) {
                        similar = false;
                        break;
                    }
                }

                if (similar) ans++;
            }
        }

        return ans;
    }
}