class Solution {
    public String largestEven(String s) {

        char[] arr = s.toCharArray();
        int n = arr.length - 1;

        if (arr[n] == '2') return s;

        int ans = s.lastIndexOf('2');
        if (ans == -1) return "";

        return s.substring(0, ++ans);
    }
}