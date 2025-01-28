class Solution {
    public int fillCups(int[] amount) {

        int sum = amount[0] + amount[1] + amount[2], ans = sum / 2;
        if (ans * 2 != sum) ans++;

        int max = Math.max(amount[0], Math.max(amount[1], amount[2]));

        return Math.max(ans, max);
    }
}