class Solution {

    int[] step = new int[]{60, 15, 5, 1};

    public int convertTime(String current, String correct) {

        if (correct.equals(current)) return 0;

        int ans = 0, currentMM = getHours(current) + getMinutes(current), correctMM = getHours(correct) + getMinutes(correct);

        for (int i : step) {
            int t = (correctMM - currentMM) / i;
            currentMM += i * t;
            ans += t;

            if (correctMM == currentMM) break;
        }

        return ans;
    }

    private static int getHours(String s) {
        return (((s.charAt(0) - '0') * 10) + (s.charAt(1) - '0')) * 60;
    }

    private static int getMinutes(String s) {
        return ((s.charAt(3) - '0') * 10) + (s.charAt(4) - '0');
    }
}