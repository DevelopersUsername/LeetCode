class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        boolean[] visited = new boolean[101];
        int[] ans = new int[friends.length];

        for (int friend : friends) visited[friend] = true;

        for (int i = 0, j = 0; i < order.length; i++)
            if (visited[order[i]]) ans[j++] = order[i];

        return ans;
    }
}