class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder ans = new StringBuilder();
        int carry = 0, sum = 0;
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;

        while(n1 >= 0 || n2 >= 0) {

            if (n1 >= 0) {
                sum += num1.charAt(n1) - '0';
            }
            if (n2 >= 0) {
                sum += num2.charAt(n2) - '0';
            }

            ans.append(sum % 10);
            carry = sum / 10;
            sum = carry;
            n1--;
            n2--;
        }

        if(carry == 1 )
            ans.append(carry);

        return ans.reverse().toString();
    }
}