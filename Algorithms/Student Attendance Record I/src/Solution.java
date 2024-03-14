class Solution {
    public boolean checkRecord(String s) {

        int absent = 0, late = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'P') late = 0;
            else if (s.charAt(i) == 'L') late++;
            else {
                absent++;
                late = 0;
            }

            if (late == 3 || absent == 2) return false;
        }

        return true;
    }
}