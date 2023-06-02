class Solution {
    public int[] replaceElements(int[] arr) {

        int max = -1, temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            temp = Math.max(max, arr[i]);
            arr[i] = max;
            max = temp;
        }

        return arr;
    }
}