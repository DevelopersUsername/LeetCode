class Solution {

    private static final String[] weekday = new String[]{
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final int[] monthLength = new int[]{
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String dayOfTheWeek(int day, int month, int year) {

        int days = 0;
        for (int i = 1971; i < year; i++)
            days += i % 4 == 0 ? 366 : 365;

        if (year % 4 == 0 && year % 100 != 0) monthLength[1] = 29;
        else monthLength[1] = 28;

        for (int i = 0; i < month - 1; i++)
            days += monthLength[i];

        return weekday[(days + day + 4) % 7];
    }
}