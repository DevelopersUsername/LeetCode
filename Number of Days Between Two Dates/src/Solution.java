class Solution {
    public int daysBetweenDates(String date1, String date2) {

        int daysInMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days1 = Integer.valueOf(date1.substring(8, 10)), days2 = Integer.valueOf(date2.substring(8, 10));
        int month1 = Integer.valueOf(date1.substring(5, 7)), month2 = Integer.valueOf(date2.substring(5, 7));
        int year1 = Integer.valueOf(date1.substring(0, 4)), year2 = Integer.valueOf(date2.substring(0, 4));

        for(int m = 0; m < month1 - 1 || m < month2 - 1; m++) {

            if (m < month1 - 1) {

                days1 += daysInMonths[m];
                if (m == 1 && isLeapYear(year1))
                    days1++;
            }

            if (m < month2 - 1) {

                days2 += daysInMonths[m];
                if (m == 1 && isLeapYear(year2))
                    days2++;
            }
        }

        for(int y = 1971; y < year1 || y < year2; y++){

            if (y < year1) {

                days1 += 365;
                if(isLeapYear(y))
                    days1++;
            }

            if (y < year2) {

                days2 += 365;
                if(isLeapYear(y))
                    days2++;
            }
        }

        return Math.abs(days1 - days2);
    }

    private boolean isLeapYear(int y){
        return y % 400 == 0 || (y % 100 != 0 && y % 4 == 0);
    }
}