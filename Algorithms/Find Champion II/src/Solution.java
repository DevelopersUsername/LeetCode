class Solution {
    public int findChampion(int n, int[][] edges) {

        int ans = -1, count = 0;
        int[] arr = new int[n];
        for (int[] edge : edges) arr[edge[1]]++;

        for (int i = 0; i < n; i++)
            if (arr[i] == 0) {
                if (++count > 1) return -1;
                else ans = i;
            }

        return ans;
    }
}