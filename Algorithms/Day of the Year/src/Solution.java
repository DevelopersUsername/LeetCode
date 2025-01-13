class Solution {

    private static final int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int dayOfYear(String date) {

        int ans = 0, day = Integer.parseInt(date.substring(8, 10)), month = Integer.parseInt(date.substring(5, 7));

        ans += day;
        for (int i = 1; i < month; i++)
            ans += days[i];

        if (isLeapYear(Integer.parseInt(date.substring(0, 4))) && month > 2)
            ans++;

        return ans;
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}