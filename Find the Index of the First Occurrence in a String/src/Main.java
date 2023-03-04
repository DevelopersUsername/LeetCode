public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("mississippi", "issi") + " -->> " + 1);
        System.out.println(new Solution().strStr("sadbutsad", "sad") + " -->> " + 0);
        System.out.println(new Solution().strStr("leetcode", "leeto") + " -->> " + -1);
        System.out.println(new Solution().strStr("a", "a") + " -->> " + 0);
        System.out.println(new Solution().strStr("aaa", "aaaa") + " -->> " + -1);
    }
}