class Solution {
    public String multiply(String num1, String num2) {

        StringBuilder ans = new StringBuilder();

        int m = num1.length(), n = num2.length();
        int[] nums = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = multiply + nums[i + j + 1];
                nums[i + j] += sum / 10;
                nums[i + j + 1] = sum % 10;
            }
        }

        for (int num : nums)
            if (num > 0 || !ans.isEmpty())
                ans.append(num);

        return ans.isEmpty() ? "0" : ans.toString();
    }
}