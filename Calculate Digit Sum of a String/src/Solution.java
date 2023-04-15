class Solution {
    public String digitSum(String s, int k) {

        if (s.length() <= k)
            return s;

        StringBuilder sb = new StringBuilder();
        int sum = 0, counter = 0;
        for (int i = 0; i < s.length(); i++) {

            counter++;
            sum += s.charAt(i) - '0';
            if (counter == k || i == s.length() - 1) {
                sb.append(sum);
                counter = 0;
                sum = 0;
            }
        }

        if (sb.length() > k)
            return digitSum(sb.toString(), k);
        else
            return sb.toString();
    }
}