class Solution {

    private static final int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int ans = 0, startDay, endDay, startMonth, endMonth;

        int arriveAliceMonth = getMonth(arriveAlice);
        int leaveAliceMonth = getMonth(leaveAlice);
        int arriveBobMonth = getMonth(arriveBob);
        int leaveBobMonth = getMonth(leaveBob);

        int arriveAliceDay = getDay(arriveAlice);
        int leaveAliceDay = getDay(leaveAlice);
        int arriveBobDay = getDay(arriveBob);
        int leaveBobDay = getDay(leaveBob);

        if (arriveAliceMonth > arriveBobMonth) {
            startMonth = arriveAliceMonth;
            startDay = arriveAliceDay;
        } else if (arriveAliceMonth < arriveBobMonth) {
            startMonth = arriveBobMonth;
            startDay = arriveBobDay;
        } else {
            startMonth = arriveAliceMonth;
            startDay = Math.max(arriveAliceDay, arriveBobDay);
        }

        if (leaveAliceMonth < arriveBobMonth
                || leaveBobMonth < arriveAliceMonth
                || (leaveAliceMonth == arriveBobMonth && leaveAliceDay < arriveBobDay))
            return 0;

        if (leaveAliceMonth > leaveBobMonth) {
            endMonth = leaveBobMonth;
            endDay = leaveBobDay;
        } else if (leaveAliceMonth < leaveBobMonth) {
            endMonth = leaveAliceMonth;
            endDay = leaveAliceDay;
        } else {
            endMonth = leaveAliceMonth;
            endDay = Math.min(leaveAliceDay, leaveBobDay);
        }

        for (int i = Math.min(startMonth, endMonth) + 1; i < Math.max(startMonth, endMonth); i++)
            ans += days[i - 1];

        if (startMonth != endMonth) {
            ans += days[startMonth - 1] - startDay;
            ans += endDay;
        } else
            ans += endDay - startDay;

        return Math.max(++ans, 0);
    }

    private static int getDay(String date) {
        return (date.charAt(3) - '0') * 10 + (date.charAt(4) - '0');
    }

    private static int getMonth(String date) {
        return (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0');
    }
}