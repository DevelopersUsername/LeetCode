class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gasSum = 0, costSum = 0;
        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if (gasSum - costSum < 0) return -1;

        int ans = 0, tank = 0;
        for (int i = 0; i < gas.length; ++i) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                tank = 0;
                ans = i + 1;
            }
        }

        return ans;
    }
}