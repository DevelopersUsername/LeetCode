class Solution {
    public void duplicateZeros(int[] arr) {

        int n = arr.length, count = 0;
        for (int i : arr)
            if (i == 0) count++;

        for (int l = n - 1, r = l+ count; l < r; l--, r--) {
            if (r < n)
                arr[r] = arr[l];
            if (arr[l] == 0 && --r < n)
                arr[r] = arr[l];
        }
    }
}