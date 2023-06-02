class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int ans = 0, l = arr.length;
        for (int i = 0; i < l; i++){
            ans += (((i + 1) * (l - i) + 1) / 2) * arr[i];
        }

        return ans;
    }
}