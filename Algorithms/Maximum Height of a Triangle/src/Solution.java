class Solution {
    public int maxHeightOfTriangle(int red, int blue) {

        int ans = 0;

        for (int i = 0; i < 2; i++) {

            int[] arr = {red, blue};
            for (int j = 1, k = i; j <= arr[k]; k ^= 1, j++) {
                arr[k] -= j;
                ans = Math.max(ans, j);
            }
        }

        return ans;
    }
}