class Solution {
    public int repeatedStringMatch(String a, String b) {

        int n = (int) Math.ceil((double) b.length() / (double) a.length());

        StringBuilder sb = new StringBuilder();
        sb.append(a.repeat(n));

        if (sb.toString().contains(b)) return n;
        else if (sb.append(a).toString().contains(b)) return n + 1;
        else return -1;
    }
}