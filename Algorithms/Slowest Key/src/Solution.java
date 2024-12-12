class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {

        char ans = 'a';
        int prev = 0, max = 0, i = 0;
        for (char c : keysPressed.toCharArray()) {

            int duration = releaseTimes[i] - prev;
            if (duration > max || (c > ans && duration == max)) {
                max = duration;
                ans = c;
            }
            prev = releaseTimes[i++];
        }

        return ans;
    }
}