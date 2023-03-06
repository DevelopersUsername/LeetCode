class Solution {

//    # Complexity
//    - Time complexity: O(1)
//    - Space complexity: O(1)
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }

    public int recursionAddDigits(int num) {

        String[] arr = Integer.toString(num).split("");

        if (arr.length > 1) {

            int newNum = 0;
            for (String s : arr) {
                newNum += Integer.parseInt(s);
            }

            return recursionAddDigits(newNum);
        } else {
            return num;
        }
    }
}