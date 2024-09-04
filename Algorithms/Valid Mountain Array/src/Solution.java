class Solution {
    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) return false;

        int max = arr[1], maxPos = 1, prev;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
                maxPos = i;
            }

        if (maxPos == arr.length - 1) return false;

        prev = max;
        for (int i = maxPos - 1; i >= 0; i--) {
            if (prev <= arr[i]) return false;
            prev = arr[i];
        }

        prev = max;
        for (int i = maxPos + 1; i < arr.length; i++) {
            if (prev <= arr[i]) return false;
            prev = arr[i];
        }

        return true;
    }
}