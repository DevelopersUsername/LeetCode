class Solution {
    public boolean isSubstringPresent(String s) {

        char[] chars = s.toCharArray();
        for (int l = 0; l < chars.length - 1; l++) {

            int r = chars.length;
            while (l < r-- - 1)
                if (chars[l] == chars[r] && chars[l + 1] == chars[r - 1])
                    return true;
        }

        return false;
    }
}