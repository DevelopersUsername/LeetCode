class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0)
            return true;

        int counter = 0;
        for (int i = 0; true;) {
            for (int j = counter; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {
                    if (i == s.length() - 1) return true;

                    i++;
                    counter++;
                }
            }

            break;
        }

        return false;
    }
}