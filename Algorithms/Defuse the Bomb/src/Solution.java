class Solution {
    public int[] decrypt(int[] code, int k) {

        int[] ans = new int[code.length];
        if (k == 0) return ans;

        int sum = 0, l = code.length,
                start = k > 0 ? 1 : l + k,
                end = k > 0 ? k : l - 1;

        for (int i = start; i <= end; i++)
            sum += code[i];

        for (int i = 0; i < code.length; i++) {
            ans[i] = sum;
            sum -= code[start++ % l];
            sum += code[++end % l];
        }

        return ans;
    }
}