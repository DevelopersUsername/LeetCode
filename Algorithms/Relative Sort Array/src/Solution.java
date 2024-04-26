class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int j = 0;
        int[] arr = new int[1001];

        for (int value : arr1) arr[value]++;
        for (int k : arr2) while (arr[k]-- > 0) arr1[j++] = k;
        for (int i = 0; i < arr.length; i++)
            while (arr[i]-- > 0) arr1[j++] = i;

        return arr1;
    }
}