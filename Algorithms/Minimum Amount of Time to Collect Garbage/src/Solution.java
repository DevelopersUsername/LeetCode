class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {

        int[] info = getGarbageInfo(garbage);
        int ans = info[0];

        for (int i = 0; i < travel.length; i++) {
            if (info[1] > 0 && i < info[1]) ans += travel[i];
            if (info[2] > 0 && i < info[2]) ans += travel[i];
            if (info[3] > 0 && i < info[3]) ans += travel[i];
        }

        return ans;
    }

    private static int[] getGarbageInfo(String[] garbage) {

        int lastM = 0, lastP = 0, lastG = 0, count = 0;

        for (int i = 0; i < garbage.length; i++)
            if (!garbage[i].isEmpty()) {
                count += garbage[i].length();
                if (garbage[i].indexOf('M') != -1) lastM = i;
                if (garbage[i].indexOf('P') != -1) lastP = i;
                if (garbage[i].indexOf('G') != -1) lastG = i;
            }

        return new int[]{count, lastM, lastP, lastG};
    }
}