class Solution {
    public int minimumFlips(int n) {

        char[] arr = Integer.toBinaryString(n).toCharArray();
        int ans = 0, s = arr.length - 1;

        for (int i = 0; i <= s / 2; i++)
            if (arr[i] != arr[s - i])
                ans++;

        return ans * 2;
    }
}