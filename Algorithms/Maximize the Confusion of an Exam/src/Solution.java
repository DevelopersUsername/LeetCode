class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int ans = 0, max = 0;
        int[] count = new int[2];
        char[] arr = answerKey.toCharArray();

        for (int l = 0, r = 0; r < answerKey.length(); r++) {
            max = Math.max(max, ++count[arr[r] == 'T' ? 1 : 0]);
            while (max + k < r - l + 1)
                count[arr[l++] == 'T' ? 1 : 0]--;
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}