class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        int n = arr.length;
        double l = 0.0, r = 1.0, m;

        while (l < r) {
            m = (l + r) / 2.0;
            int f = 0, p = 0, q = 1;

            for (int i = 0, j = 1; i < n; i++) {
                while (j < n && arr[i] > m * arr[j])
                    j++;
                if (j == n) break;

                f += n - j;
                if (p * arr[j] < q * arr[i]) {
                    p = arr[i];
                    q = arr[j];
                }
            }

            if (f == k) return new int[]{p, q};
            else if (f > k) r = m;
            else l = m;
        }

        return new int[2];
    }
}