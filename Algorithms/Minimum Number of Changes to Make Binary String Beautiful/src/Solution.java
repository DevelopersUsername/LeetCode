public class Solution {
    public int minChanges(String s) {

        int ans = 0;
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2)
            if (arr[i - 1] != arr[i])
                ans++;

        return ans;
    }
}
