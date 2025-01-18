class Solution {
    public int distMoney(int money, int children) {

        if (children > money) return -1;

        int ans = 0;
        money -= children;

        while (money > 6 && children > 0) {
            ans++;
            money -= 7;
            children--;
        }

        if (money > 0 && children == 0)
            ans--;
        else if (money == 3 && children == 1)
            ans--;

        return ans;
    }
}