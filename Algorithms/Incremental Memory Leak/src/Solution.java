class Solution {
    public int[] memLeak(int memory1, int memory2) {

        int ans = 1;
        while (memory1 >= ans || memory2 >= ans) {
            if (memory1 >= memory2) memory1 -= ans;
            else memory2 -= ans;
            ans++;
        }

        return new int[]{ans, memory1, memory2};
    }
}