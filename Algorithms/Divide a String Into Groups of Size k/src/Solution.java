class Solution {
    public String[] divideString(String s, int k, char fill) {

        String[] ans = new String[s.length() / k + (s.length() % k != 0 ? 1 : 0)];
        StringBuilder sb = new StringBuilder(k);
        int count = 0, index = 0;

        for (int i = 0; i < s.length(); i++) {

            sb.append(s.charAt(i));
            if (++count == k) {
                ans[index++] = sb.toString();
                sb = new StringBuilder(k);
                count = 0;
            }
        }

        if (count < k && count != 0) {
            while (count++ < k)
                sb.append(fill);
            ans[index] = sb.toString();
        }

        return ans;
    }
}