class Solution {
    public int sumOfUnique(int[] nums) {

        int ans = 0;
        int[] arr = new int[101];

        for (int i : nums) {
            arr[i]++;
        }

        for (int i = 0; i < 101; i++) {
            if (arr[i] == 1)
                ans += i;
        }

        return ans;
    }
}