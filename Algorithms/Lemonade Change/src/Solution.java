class Solution {
    public boolean lemonadeChange(int[] bills) {

        int count5 = 0, count10 = 0;
        for (int bill : bills) {

            switch (bill) {
                case 5:
                    count5++;
                    break;
                case 10:
                    count10++;
                    if (count5 > 0) {
                        count5--;
                    } else return false;
                    break;
                case 20:
                    if (count10 > 0 & count5 > 0) {
                        count10--;
                        count5--;
                    } else if (count5 > 2)
                        count5 -= 3;
                    else return false;
                    break;
            }
        }

        return true;
    }
}