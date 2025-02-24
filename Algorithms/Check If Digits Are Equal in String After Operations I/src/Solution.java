    class Solution {
        public boolean hasSameDigits(String s) {

            if (s.length() > 2) {

                StringBuilder sb = new StringBuilder(s.length() - 1);

                char[] chars = s.toCharArray();
                for (int i = 1; i < chars.length; i++)
                    sb.append((chars[i - 1] - '0' + chars[i] - '0') % 10);

                return hasSameDigits(sb.toString());
            }

            return s.charAt(0) - '0' == s.charAt(1) - '0';
        }
    }