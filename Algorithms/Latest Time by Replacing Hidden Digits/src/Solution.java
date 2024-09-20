class Solution {
    public String maximumTime(String time) {

        StringBuilder ans = new StringBuilder(5);
        getFirstHours(ans, time);
        ans.append(':');
        getMinutes(ans, time);

        return ans.toString();
    }

    private void getFirstHours(StringBuilder ans, String time) {

        if (time.charAt(0) == '?')
            if (time.charAt(1) != '?' && time.charAt(1) - '0' > 3) ans.append('1');
            else ans.append('2');
        else ans.append(time.charAt(0));

        if (time.charAt(1) == '?') {
            if (ans.charAt(0) == '2') ans.append('3');
            else ans.append('9');
        } else ans.append(time.charAt(1));
    }

    private void getMinutes(StringBuilder ans, String time) {

        if (time.charAt(3) == '?') ans.append('5');
        else ans.append(time.charAt(3));

        if (time.charAt(4) == '?') ans.append('9');
        else ans.append(time.charAt(4));
    }
}