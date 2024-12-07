class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        int n = ranks.length;
        int[] cards = new int[4];
        int[][] count = new int[4][14];

        for (int i = 0; i < n; i++) {
            count[suits[i] - 'a'][ranks[i]]++;
            cards[suits[i] - 'a']++;
        }

        return switch (getRank(n, cards, count)) {
            case 4 -> "Flush";
            case 3 -> "Three of a Kind";
            case 2 -> "Pair";
            default -> "High Card";
        };
    }

    private int getRank(int n, int[] cards, int[][] count) {

        int rank;
        rank = checkFlush(n, cards, count);
        if (rank > 0)
            return rank;
        rank = checkThreeOfAKindOrPair(count);

        return rank;
    }

    private static int checkFlush(int n, int[] cards, int[][] count) {

        boolean isFlush;
        for (int i = 0; i < count.length; i++) {

            if (cards[i] != n) continue;

            isFlush = true;
            for (int j : count[i])
                if (j > 1) {
                    isFlush = false;
                    break;
                }
            if (isFlush)
                return 4;
        }

        return 0;
    }

    private static int checkThreeOfAKindOrPair(int[][] count) {

        int k, maxCount = 0;
        for (int i = 0; i < 14; i++) {

            k = 0;
            for (int[] j : count)
                if (j[i] > 0) k++;
            if (k >= 3) return 3;
            else maxCount = Math.max(maxCount, k);
        }

        return maxCount;
    }
}