class Solution {
    public int fib(int n) {

        if (n == 0)
            return 0;
        else if (n <= 2)
            return 1;

        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public int fibPhi(int n) {

        if (n == 0)
            return 0;
        else if (n <= 2)
            return 1;

        double sqrtFive = Math.sqrt(5);
        double phi = (sqrtFive + 1) / 2;

        return (int) Math.round((int) Math.pow(phi, n) / sqrtFive);
    }
}