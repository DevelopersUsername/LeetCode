class Solution {
    public String longestDiverseString(int a, int b, int c) {
        return createHappyString(a, b, c, 'a', 'b', 'c');
    }

    private String createHappyString(int firstCount, int secondCount, int thirdCount, char first, char second, char third) {

        if (firstCount < secondCount) return createHappyString(secondCount, firstCount, thirdCount, second, first, third);
        if (secondCount < thirdCount) return createHappyString(firstCount, thirdCount, secondCount, first, third, second);
        if (secondCount == 0) return String.valueOf(first).repeat(Math.min(firstCount, 2));

        int firstUse = Math.min(firstCount, 2);
        int secondUse = (firstCount - firstUse >= secondCount) ? 1 : 0;

        return String.valueOf(first).repeat(firstUse)
                + String.valueOf(second).repeat(secondUse)
                + createHappyString(firstCount - firstUse, secondCount - secondUse, thirdCount, first, second, third);
    }
}