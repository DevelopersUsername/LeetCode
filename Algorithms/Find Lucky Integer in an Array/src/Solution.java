class Solution {
    public int findLucky(int[] arr) {

        int[] temp = new int[501];
        for (int j : arr) temp[j]++;

        for (int i = temp.length - 1; i > 0; i--)
            if (temp[i] == i) return temp[i];

        return -1;
    }
}