class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getSum(firstWord) + getSum(secondWord) == getSum(targetWord);
    }

    private int getSum(String word) {

        int sum = 0, index = (int) Math.pow(10, word.length() -1);
        for (char c : word.toCharArray()) {
            sum += (c - 97) * index;
            index /= 10;
        }

        return sum;
    }
}