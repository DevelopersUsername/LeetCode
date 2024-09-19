class Solution {
    public String licenseKeyFormatting(String s, int k) {

        int l = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') continue;
            if (l > 0 && l % k == 0)
                sb.append('-');
            l++;
            sb.append(Character.toUpperCase(s.charAt(i)));
        }

        return sb.reverse().toString();
    }
}