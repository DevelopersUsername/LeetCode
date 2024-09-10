class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {

        int l;
        for (l = 0; l < Math.min(Math.min(s1.length(), s2.length()), s3.length()); l++) {

            char c1 = s1.charAt(l);
            if (c1 != s2.charAt(l) || c1 != s3.charAt(l)) break;
        }

        if (l == 0) return -1;
        else return s1.length() + s2.length() + s3.length() - 3 * l;
    }
}