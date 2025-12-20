class Solution {
    public boolean doesValidArrayExist(int[] derived) {

        int ans = 0;
        for (int d : derived) ans += d;

        return ans % 2 == 0;
    }
}