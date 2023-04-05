class Solution {
    public String reverseStr(String s, int k) {

        int start, end;
        char tmp;
        char[] ans = s.toCharArray();

        for(int i = 0; i < ans.length; i += 2 * k){

            start = i;
            end = Math.min(i + k - 1, s.length() - 1);
            while(start < end) {
                tmp = ans[start];
                ans[start++] = ans[end];
                ans[end--] = tmp;
            }
        }

        return new String(ans);
    }
}