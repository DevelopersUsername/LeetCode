class Solution {
    public int mostWordsFound(String[] sentences) {

//        - Time complexity: O(n)
//        - Space complexity: O(1)

        int result = 0;
        for (String sentence : sentences) {
            result = Math.max(result, sentence.split(" ").length);
        }

        return result;
    }
}