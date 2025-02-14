class Solution {
    public boolean hasMatch(String s, String p) {

        int n = p.indexOf('*');
        int part1 = s.indexOf(p.substring(0, n));
        if (part1 == -1) return false;
        int part2 = s.indexOf(p.substring(n + 1), part1 + n);

        return part2 != -1;
    }
}