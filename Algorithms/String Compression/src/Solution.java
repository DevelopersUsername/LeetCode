class Solution {
    public int compress(char[] chars) {

        char t = ' ';
        int ans = 0, counter;
        for (int i = 0; i < chars.length;) {

            t = chars[i];
            counter = 0;

            while (i < chars.length && chars[i] == t) {
                counter++;
                i++;
            }

            chars[ans++] = t;
            if (counter > 1)
                for (final char c : String.valueOf(counter).toCharArray())
                    chars[ans++] = c;
        }

        return ans;
    }
}