class Solution {
    public int minOperations(String[] logs) {

        int ans = 0;
        for (String log : logs)
            if (log.equals("../") ) ans += ans > 0 ? -1 : 0;
            else if (!log.equals("./")) ans++;

        return ans;
    }
}