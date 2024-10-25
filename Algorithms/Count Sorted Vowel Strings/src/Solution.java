class Solution {
    public int countVowelStrings(int n) {

        int ans = 0;
        int[] count = new int[]{1, 1, 1, 1, 1};

        for (int i = 2; i <= n; i++) {

            int[] t = new int[5];
            for (int j = 0; j < 5; j++)
                for (int k = 0; k <= j; k++)
                    t[j] += count[k];
            count = t;
        }

        for (int i : count)
            ans += i;

        return ans;
    }
}