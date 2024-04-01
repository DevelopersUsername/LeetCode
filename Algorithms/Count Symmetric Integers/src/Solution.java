class Solution {
    public int countSymmetricIntegers(int low, int high) {

        int ans = 0;
        for (int i = low; i <= high; i++)
            if (isSymmetric(i)) ans++;

        return ans;
    }

    private boolean isSymmetric(int elem) {

        if (elem > 10 && elem < 100) return (elem / 10) == (elem % 10);
        else if (elem > 1000 && elem < 10000) {
            int l = elem / 100, r = elem % 100;
            return (l / 10 + l % 10) == (r / 10 + r % 10);
        }

        return false;
    }
}