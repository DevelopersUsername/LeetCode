class Solution {
    public int minTimeToType(String word) {

        int ans = 0, position = 0;
        for (char c : word.toCharArray()) {

            int diff = Math.abs((c - 'a') - position);
            ans += Math.min(diff, 26 - diff) + 1;
            position = c - 'a';
        }

        return ans;
    }
}