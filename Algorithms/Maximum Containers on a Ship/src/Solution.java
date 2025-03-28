class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min((int) Math.pow(n, 2), maxWeight / w);
    }
}