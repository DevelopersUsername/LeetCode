class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        StringBuilder ans = new StringBuilder(s.length());
        int[] count = new int[26];

        char[] arr = s.toCharArray();
        for (char c : arr) count[c - 'a']++;

        for (int i = count.length - 1, j = i - 1; i >= 0; i--) {

            j = Math.min(j, i - 1);
            while (true) {

                int repeats = Math.min(count[i], repeatLimit);
                if (repeats == 0) break;
                ans.append(String.valueOf((char) ('a' + i)).repeat(repeats));
                count[i] -= repeats;

                if (count[i] == 0) break;
                while (j >= 0 && count[j] == 0) --j;
                if (j < 0) break;

                ans.append((char) ('a' + j));
                count[j]--;
            }
        }

        return ans.toString();
    }
}