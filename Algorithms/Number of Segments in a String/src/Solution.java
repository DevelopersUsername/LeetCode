class Solution {
    public int countSegments(String s) {

        int ans = 0;
        for (String str : s.split(" ")) {
            if (str.trim().length() > 0)
                ans++;
        }

        return ans;
    }

    public int countSegmentsChars(String s) {

        int segments = 0;
        boolean inSegment = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                inSegment = false;
            } else if (!inSegment) {
                inSegment = true;
                segments++;
            }
        }

        return segments;
    }
}