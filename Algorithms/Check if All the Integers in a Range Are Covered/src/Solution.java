class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        for (int i = left; i <= right; i++) {

            boolean flag = false;
            for (int[] range : ranges)
                if (i >= range[0] && i <= range[1]) {
                    flag = true;
                    break;
                }

            if (!flag)
                return false;
        }

        return true;
    }
}