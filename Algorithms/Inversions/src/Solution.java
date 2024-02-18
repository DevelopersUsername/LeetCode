import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public void inversions() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] elems = new int[Integer.parseInt(st.nextToken())];

        int i = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            elems[i++] = Integer.parseInt(st.nextToken());

        System.out.println(invCount(elems));
    }

    public long invCount(int[] arr) {

        if (arr.length < 2) return 0;

        int m = (arr.length + 1) / 2;
        int[] left = Arrays.copyOfRange(arr, 0, m);
        int[] right = Arrays.copyOfRange(arr, m, arr.length);

        return invCount(left) + invCount(right) + merge(arr, left, right);
    }

    private long merge(int[] arr, int[] left, int[] right) {

        int i = 0, j = 0;
        long count = 0;
        while (i < left.length || j < right.length) {
            if (i == left.length) arr[i + j] = right[j++];
            else if (j == right.length) arr[i + j] = left[i++];
            else if (left[i] <= right[j]) arr[i + j] = left[i++];
            else {
                arr[i + j] = right[j++];
                count += left.length - i;
            }
        }

        return count;
    }
}
