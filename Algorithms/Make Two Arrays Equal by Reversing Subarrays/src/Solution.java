class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int[] t = new int[1001];

        for (int i : target) t[i]++;
        for (int i : arr) t[i]--;
        for (int i : t) if (i != 0) return false;

        return true;
    }
}