import java.util.Arrays;

class Solution {
    public int splitNum(int num) {

        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);

        StringBuilder builder1 = new StringBuilder(), builder2 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder1.append(arr[i++]);
            if (i < arr.length) builder2.append(arr[i]);
        }

        return Integer.parseInt(builder1.toString()) + Integer.parseInt(builder2.toString());
    }
}