class Solution {
    public String removeOccurrences(String s, String part) {

        StringBuilder ans = new StringBuilder(s);

        int start = ans.indexOf(part), n = part.length();
        while (start != -1) {
            ans.delete(start, start + n);
            start = ans.indexOf(part);
        }

        return ans.toString();
    }
}