class Solution {
    public int captureForts(int[] forts) {

        int ans = 0, count, l;
        for (int i = 0; i < forts.length; i++) {

            if (forts[i] != 0) {

                l = forts[i];
                count = 0;

                for (int j = i + 1; j < forts.length; j++) {

                    if (forts[j] == 0) count++;
                    else if (forts[j] == l) break;
                    else if (forts[j] != l) {
                        ans = Math.max(ans, count);
                        break;
                    }
                }
            }
        }

        return ans;
    }
}