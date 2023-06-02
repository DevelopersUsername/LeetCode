public class Main {
    public static void main(String[] args) {

        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(new Solution().countConsistentStrings("ab", words));

        String[] words1 = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(new Solution().countConsistentStrings("abc", words1));
    }
}