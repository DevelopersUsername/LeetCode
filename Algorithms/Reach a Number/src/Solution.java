class Solution {
    public int reachNumber(int target) {

        target = Math.abs(target);
        int ans = 0, pos = 0;

        while (pos < target) pos += ++ans;
        while ((pos - target) % 2 == 1) pos += ++ans;

        return ans;
    }
}