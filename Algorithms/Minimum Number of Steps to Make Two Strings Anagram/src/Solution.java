class Solution {
    public int minSteps(String s, String t) {

        int[] temp = new int[26];
        char[] arr1 = s.toCharArray(), arr2 = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            temp[arr1[i] - 97]++;
            temp[arr2[i] - 97]--;
        }

        int ans = 0;
        for (int i : temp)
            if (i > 0) ans += i;

        return ans;
    }
}