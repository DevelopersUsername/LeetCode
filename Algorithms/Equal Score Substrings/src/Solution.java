class Solution {
    public boolean scoreBalance(String s) {

        char[] arr = s.toCharArray();
        int l = 0, r = s.length() - 1, lSum = 0, rSum = 0;

        while (l <= r)
            if (lSum < rSum) lSum += (arr[l++] - 'a') + 1;
            else rSum += (arr[r--] - 'a') + 1;

        return lSum == rSum;
    }
}