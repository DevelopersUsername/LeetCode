class Solution {
    public int findSpecialInteger(int[] arr) {

        int ans = 0, prev = arr[0], maxCount = 0, currCount = 1, t = arr.length / 4 + 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev)
                currCount++;
            else {

                if (currCount > maxCount) {
                    ans = prev;
                    maxCount = currCount;
                }
                prev = arr[i];
                currCount = 1;
            }

            if (currCount >= t) return prev;
        }

        if (currCount > maxCount)
            ans = prev;

        return ans;
    }
}