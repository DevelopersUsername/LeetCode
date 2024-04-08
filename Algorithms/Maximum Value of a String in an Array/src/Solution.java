class Solution {
    public int maximumValue(String[] strs) {

        int ans = 0;
        boolean isDigit;

        for (String str : strs) {
            isDigit = true;
            for (int i = 0; i < str.length(); i++)
                if (!Character.isDigit(str.charAt(i))) {
                    ans = Math.max(ans, str.length());
                    isDigit = false;
                    break;
                }
            if (isDigit) ans = Math.max(ans, Integer.parseInt(str));
        }

        return ans;
    }
}