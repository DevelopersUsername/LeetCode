class Solution {
    public String thousandSeparator(int n) {

        if (n == 0) return "0";

        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            if (n > 1000) {

                int t = n % 1000;
                StringBuilder builder = new StringBuilder(4);
                for (int i = 0; i < 3; i++) {
                    builder.append(t % 10);
                    t /= 10;
                }
                ans.insert(0, builder.append(".").reverse());
            } else ans.insert(0, n);
            n /= 1000;
        }

        return ans.toString();
    }
}