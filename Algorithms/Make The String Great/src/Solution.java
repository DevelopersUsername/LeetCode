class Solution {
    public String makeGood(String s) {

        StringBuilder sb = new StringBuilder(s);

        int l = 0;
        while (l < sb.length() - 1)
            if (Math.abs(sb.charAt(l) - sb.charAt(l + 1)) == 32) {
                sb.delete(l, l + 2);
                if (l > 0) l--;
            } else l++;

        return sb.toString();
    }
}