class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int ans = arr1.length;
        for (int i : arr1)
            for (int j : arr2)
                if (Math.abs(i - j) <= d) {
                    ans--;
                    break;
                }

        return ans;
    }
}