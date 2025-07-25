class Solution {
    public int compareVersion(String version1, String version2) {

        int i = 0, j = 0, n1 = version1.length(), n2 = version2.length();

        while (i < n1 || j < n2) {

            int revision1 = 0;
            while (i < version1.length() && version1.charAt(i) != '.') {
                revision1 *= 10;
                revision1 += version1.charAt(i++) - '0';
            }

            int revision2 = 0;
            while (j < version2.length() && version2.charAt(j) != '.') {
                revision2 *= 10;
                revision2 += version2.charAt(j++) - '0';
            }

            if (revision1 < revision2) return -1;
            else if (revision1 > revision2) return 1;

            i++; j++;
        }

        return 0;
    }
}