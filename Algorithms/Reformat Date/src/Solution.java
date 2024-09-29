import java.util.*;

class Solution {

    private static final Map<String, String> month = new HashMap<>() {{
        put("Jan", "01");
        put("Feb", "02");
        put("Mar", "03");
        put("Apr", "04");
        put("May", "05");
        put("Jun", "06");
        put("Jul", "07");
        put("Aug", "08");
        put("Sep", "09");
        put("Oct", "10");
        put("Nov", "11");
        put("Dec", "12");
    }};

    public String reformatDate(String date) {

        StringBuilder ans = new StringBuilder(10);

        int l = date.length();
        ans.append(date, l - 4, l)
                .append('-')
                .append(month.get(date.substring(l - 8, l - 5)))
                .append('-');

        if (date.charAt(1) - '0' >= 0 && date.charAt(1) - '0' < 10)
            ans.append(date, 0, 2);
        else
            ans.append('0').append(date.charAt(0));

        return ans.toString();
    }
}