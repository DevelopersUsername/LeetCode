class Solution {
    public boolean checkPrimeFrequency(int[] nums) {

        int[] count = new int[101];
        for (int num : nums) count[num]++;

        for (int i : count)
            if (isPrime(i)) return true;

        return false;
    }

    private static boolean isPrime(int num) {

        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}