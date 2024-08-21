import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {

        Arrays.sort(arr);

        int sum = 0, offset = arr.length / 20;
        for (int i = offset; i < arr.length - offset; i++)
            sum += arr[i];

        return (double) sum / (arr.length - offset * 2);
    }
}