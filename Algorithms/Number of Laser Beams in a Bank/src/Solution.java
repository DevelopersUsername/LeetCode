class Solution {
    public int numberOfBeams(String[] bank) {

        int ans = 0, prevBeams = 0;
        for (String floor : bank) {

            int beams = 0;
            for (int i = 0; i < floor.length(); i++) if (floor.charAt(i) == '1') beams++;

            if (beams != 0) {
                ans += beams * prevBeams;
                prevBeams = beams;
            }
        }

        return ans;
    }
}