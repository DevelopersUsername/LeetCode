class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {

        int sum = 0;
        for (int i : arr)
            sum += i;

        if (sum % 3 != 0)
            return false;

        int avg = sum / 3, partCount = 0, partSum = 0;
        for (int i : arr) {

            partSum += i;
            if (partSum == avg) {
                partCount++;
                partSum = 0;
            }
        }

        return partCount >= 3;
    }
}